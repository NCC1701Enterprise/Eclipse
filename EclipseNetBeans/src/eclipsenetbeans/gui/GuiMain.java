package eclipsenetbeans.gui;

import eclipsenetbeans.gui.ScreenRenderer;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import eclipsenetbeans.gui.widgets.WidgetScreen;

public class GuiMain {

    public static final int TARGET_FPS = 60;
    private static final boolean SHOW_FPS = false;
    private static final DisplayMode[] BEST_DISPLAY_MODES = new DisplayMode[]{
        new DisplayMode(640, 480, 32, 0),
        new DisplayMode(640, 480, 16, 0),
        new DisplayMode(640, 480, 8, 0)
    };

    private static GuiMain instance;

    JFrame mainFrame;

    private volatile long delta;
    private volatile boolean running = false;

    private double fps;
    private final DecimalFormat df = new DecimalFormat("00.00");

    public static GuiMain getGuiMain() {
        return instance;
    }

    public GuiMain(final int numBuffers, final GraphicsDevice device, final Screen start) {
        instance = this;
        
        try {
            GraphicsConfiguration gc = device.getDefaultConfiguration();
            
            mainFrame = new JFrame(gc);
            mainFrame.setUndecorated(true);
            mainFrame.setIgnoreRepaint(true);
            
            ScreenRenderer.setFrame(mainFrame);
            ScreenRenderer.setScreen(start);
           
            device.setFullScreenWindow(mainFrame);
            if (device.isDisplayChangeSupported()) {
                chooseBestDisplayMode(device);
            }
            
            Rectangle bounds = mainFrame.getBounds();
            
            mainFrame.createBufferStrategy(numBuffers);
            BufferStrategy bufferStrategy = mainFrame.getBufferStrategy();
            
            running = true;
            int rate = (int) ((1f / TARGET_FPS) * 1000); //ms per frame
            long endTime = System.currentTimeMillis();
            delta = rate;
            while (running) {
                long startTime = System.currentTimeMillis();
                delta += startTime - endTime;

                Graphics2D g2 = (Graphics2D) bufferStrategy.getDrawGraphics();
                if (!bufferStrategy.contentsLost()) {
                    render(g2, bounds);
                    bufferStrategy.show();
                    g2.dispose();
                }

                endTime = System.currentTimeMillis();
                delta = endTime - startTime;
                if (rate - delta > 0) {
                    try {
                        Thread.sleep(rate - delta);
                    } catch (InterruptedException e) {
                        System.out.println("[Severe] Interrupted while sleeping!");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            device.setFullScreenWindow(null);
        }
    }

    private void render(Graphics2D g2, Rectangle bounds) {
        ScreenRenderer.render(g2, bounds, (delta * TARGET_FPS) / 1000.);
        if (SHOW_FPS) {
            fps = (0.9d * fps) + (0.1d * (1d / (delta / 1000d)));
            g2.setColor(Color.black);
            g2.fillRect(0, 0, 100, 40);
            g2.setFont(new Font("Times New Roman", Font.BOLD, 12));
            g2.setColor(Math.abs((fps / TARGET_FPS) - 1) < 0.01 ? Color.green : Color.red);
            g2.drawString("FPS: " + df.format(fps), 10, 20);
        }
    }

    public void stop() {
        running = false;
    }

    public static void chooseBestDisplayMode(GraphicsDevice device) {
        DisplayMode best = getBestDisplayMode(device);
        if (best != null) {
            device.setDisplayMode(best);
        }
    }

    private static DisplayMode getBestDisplayMode(GraphicsDevice device) {
        for (int x = 0; x < BEST_DISPLAY_MODES.length; x++) {
            DisplayMode[] modes = device.getDisplayModes();
            for (int i = 0; i < modes.length; i++) {
                if (modes[i].getWidth() == BEST_DISPLAY_MODES[x].getWidth() && modes[i].getHeight() == BEST_DISPLAY_MODES[x].getHeight() && modes[i].getBitDepth() == BEST_DISPLAY_MODES[x].getBitDepth()) {
                    return BEST_DISPLAY_MODES[x];
                }
            }
        }
        return null;
    }
}
