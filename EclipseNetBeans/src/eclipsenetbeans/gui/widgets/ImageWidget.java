package eclipsenetbeans.gui.widgets;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public class ImageWidget extends Widget {
	private final Image im;
	
	public ImageWidget(Rectangle size, Image image) {
		this(size.x, size.y, size.width, size.height, image);
	}
	
	public ImageWidget(int x, int y, int w, int h, Image image) {
		super(x,y,w,h);
		im = image;
	}

	@Override
	public void render(Graphics2D g2, Rectangle bounds, double off) {
		g2.drawImage(im, getX(), getY(), getWidth(), getHeight(), null);
	}

}
