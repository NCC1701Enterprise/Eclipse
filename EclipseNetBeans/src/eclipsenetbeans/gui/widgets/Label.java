package eclipsenetbeans.gui.widgets;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Label extends Widget {
	private final String name;
	private final Font f;
	private final Color c;
	
	public Label(String name, Font f, Color c) {
		this(0,0,0,0,name,f,c);
	}
	
	public Label(Rectangle bounds, String name, Font f, Color c) {
		this(bounds.x, bounds.y, bounds.width, bounds.height, name,f, c);
	}
	
	public Label(int x, int y, int w, int h, String name, Font f, Color c) {
		super(x,y,w,h);
		this.name = name;
		this.f = f;
		this.c = c;
	}
	
	@Override
	public void render(Graphics2D g2, Rectangle bounds, double off) {
		Rectangle bnds = getBounds();
		Rectangle2D strbounds = f.getStringBounds(name, g2.getFontRenderContext());
		int x = (int) ((bnds.getWidth() - strbounds.getWidth()) / 2);
		x+=bnds.getX();
		int y = (int) ((bnds.getHeight() - strbounds.getHeight()) / 2);
		y+=bnds.getY() + strbounds.getHeight();
		g2.setColor(c);
		g2.setFont(f);
		g2.drawString(name, x, y);
	}

}
