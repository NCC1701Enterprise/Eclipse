package eclipsenetbeans.gui;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;
import java.text.DecimalFormat;

import javax.swing.JFrame;


public class GuiMain {

    public static final int TARGET_FPS = 60;
    private static final boolean SHOW_FPS = true;
    private static final DisplayMode[] BEST_DISPLAY_MODES = new DisplayMode[]{
        new DisplayMode(800, 600, 32, 0),
        new DisplayMode(800, 600, 16, 0),
        new DisplayMode(800, 600, 8, 0)
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
            long startTime = System.currentTimeMillis();
            delta = rate;
            while (running) {
                long ctime = System.currentTimeMillis();
                delta = ctime - startTime;
                startTime = ctime;

                Graphics2D g2 = (Graphics2D) bufferStrategy.getDrawGraphics();
                if (!bufferStrategy.contentsLost()) {
                    render(g2, bounds);
                    bufferStrategy.show();
                    g2.dispose();
                }

                delta = System.currentTimeMillis() - startTime;
                if (rate - delta > 1) {
                    try {
                        Thread.sleep(rate - delta - 1);
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
            fps = (0.7d * fps) + (0.3d * (1000d / delta));
            if (Double.isInfinite(fps)) fps = (1d/TARGET_FPS);
            g2.setColor(Color.black);
            g2.fillRect(0, 0, 100, 40);
            g2.setFont(new Font("Times New Roman", Font.BOLD, 12));
            g2.setColor(Math.abs(fps - TARGET_FPS) < 5 ? Color.green : Color.red);
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
