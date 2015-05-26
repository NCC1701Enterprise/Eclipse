package eclipsenetbeans.gui.widgets;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public abstract class Widget {

    private Rectangle bounds = new Rectangle();

    public Widget() {
    }

    public Widget(Rectangle size) {
        this(size.x, size.y, size.width, size.height);
    }

    public Widget(int x, int y, int w, int h) {
        setLocation(x, y);
        setSize(w, h);
    }

    public void setLocation(int x, int y) {
        bounds.x = x;
        bounds.y = y;
    }

    public int getY() {
        return bounds.y;
    }

    public int getX() {
        return bounds.x;
    }

    public void setSize(int width, int height) {
        bounds.width = width;
        bounds.height = height;
    }

    public int getHeight() {
        return bounds.height;
    }

    public int getWidth() {
        return bounds.width;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public abstract void render(Graphics2D g2, Rectangle bounds, double off);

}
