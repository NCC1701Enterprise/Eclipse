package eclipsenetbeans.gui.widgets;

import java.awt.Rectangle;


public abstract class Control extends Widget {
	
	public Control(Rectangle size) {
		this(size.x, size.y, size.width, size.height);
	}
	
	public Control(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
	
	/**
	 * When the mouse hovers over the control.
	 */
	public void mouseHover(boolean over) {}
	
	/**
	 * When the mouse hovers over the control, pressed.
	 */
	public void mouseDrag(int button, boolean over) {}
	
	/**
	 * When the mouse is pressed on the control.
	 */
	public void mousePress(int button) {}
	
	/**
	 * When the mouse is released on the control.
	 */
	public void mouseRelease(int button) {}
}
