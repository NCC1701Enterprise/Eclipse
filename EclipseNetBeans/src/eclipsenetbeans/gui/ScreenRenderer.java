package eclipsenetbeans.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class ScreenRenderer {
	private static Screen screen;
	private static JFrame frame = null;
	
	public static void render(Graphics2D g2, Rectangle bounds, double off) {
		g2.setColor(Color.black);
		g2.fill(bounds);
		screen.render(g2, bounds, off);
	}
	
	public static void setFrame(JFrame frame) {
		ScreenRenderer.frame = frame;
	}
	
	public static void setScreen(Screen s) {
		if(screen != null) {
			frame.removeMouseMotionListener(screen);
			frame.removeMouseListener(screen);
			frame.removeMouseWheelListener(screen);
		}
		screen = s;
		frame.addMouseMotionListener(screen);
		frame.addMouseListener(screen);
		frame.addMouseWheelListener(screen);
	}
	
	public static Screen getScreen(Screen s) {
		return screen;
	}

}
