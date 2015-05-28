package eclipsenetbeans.gui.widgets;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Button extends Control {
	private static final BufferedImage normal, hover, press;
	private static final Color color = new Color(77,0,0);
	private static final Color disabled = new Color(50,50,50,150);
	static {
		BufferedImage t1 = null, t2 = null, t3 = null;
		try {
			t1 = ImageIO.read(Button.class.getResource("Button.png"));
			t2 = ImageIO.read(Button.class.getResource("ButtonHover.png"));
			t3 = ImageIO.read(Button.class.getResource("ButtonPress.png"));
		} catch (Exception e) {
			System.err.println("Error loading button images.");
			e.printStackTrace();
			System.exit(1);
		}
		normal = t1;
		hover = t2;
		press = t3;
	}
	
	private int state = 0;
	private boolean enabled = true;
	private final String name;
	private final Font f;
	
	public Button(String name, Font f) {
		this(0,0,0,0,name,f);
	}
	
	public Button(Rectangle bounds, String name, Font f) {
		this(bounds.x, bounds.y, bounds.width, bounds.height, name,f);
	}
	
	public Button(int x, int y, int w, int h, String name, Font f) {
		super(x,y,w,h);
		this.name = name;
		this.f = f;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public void mouseHover(boolean over) {
		state = over ? 1 : 0;
	}

	@Override
	public void mouseDrag(int button, boolean over) {
		state = over ? 2 : 0;
	}

	@Override
	public void mousePress(int button) {
		state = 2;
	}

	@Override
	public void mouseRelease(int button) {
		state = 1;
	}
	
	@Override
	public void render(Graphics2D g2, Rectangle bounds, double off) {
            Color bordercolor = new Color(90,0,0);
		if (enabled) {
			switch (state) {
			case 0:
				g2.setColor(color); 
                                g2.fillRect(bounds.x,bounds.y,bounds.width,bounds.height); 
                                g2.setColor(bordercolor); 
                                g2.drawRect(bounds.x,bounds.y,bounds.width,bounds.height);
				break;
			case 1:
				g2.drawImage(hover, getX(), getY(), getWidth(), getHeight(), null);
				break;
			case 2:
				g2.drawImage(press, getX(), getY(), getWidth(), getHeight(), null);
				break;
			}
		} else {
			g2.fillRect(getX(),getY(),getWidth(),getHeight());
		}
		Rectangle bnds = getBounds();
		Rectangle2D strbounds = f.getStringBounds(name, g2.getFontRenderContext());
		int x = (int) ((bnds.getWidth() - strbounds.getWidth()) / 2);
		x+=bnds.getX();
		int y = (int) ((bnds.getHeight() - strbounds.getHeight()) / 2);
		y+=bnds.getY() + strbounds.getHeight();
		g2.setColor(color);
		g2.setFont(f);
		g2.drawString(name, x, y);
		if(!enabled) {
			g2.setColor(disabled);
			g2.fillRect(getX(), getY(), getWidth(), getHeight());
		}
	}

}
