package eclipsenetbeans.gui;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;

public interface Screen extends MouseListener, MouseMotionListener, MouseWheelListener {
	public void render(Graphics2D g2, Rectangle bounds, double off);
}
