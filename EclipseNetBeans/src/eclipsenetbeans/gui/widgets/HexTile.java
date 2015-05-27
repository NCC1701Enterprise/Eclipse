package eclipsenetbeans.gui.widgets;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;


public class HexTile extends Widget {
  private static final int RADIUS = 50; //or whatecer
  private Polygon base;
  private Polygon current;
  int[] xs = new int [6], ys = new int [6];

  public HexTile (int x, int y) {
    setSize(2*RADIUS, 2*RADIUS);
    setLocation(x-(RADIUS/2),y-RADIUS);
    
    for (int i = 0; i < 6; i++){ 
        int deg = 60*i;
        double rad = (double)(Math.PI/180*deg);
        xs [i] = (int)(RADIUS*Math.cos(rad)); 
        ys [i] = (int)(RADIUS*Math.sin(rad)); 
    }
    current = new Polygon(xs,ys,6);
    current.translate(getX() + (getWidth()/2),getY() + (getHeight()/2));
  }

  public void setLocation(int x, int y) {
    super.setLocation(x,y);
    current = new Polygon(xs,ys,6);
    current.translate(getX() + (getWidth()/2),getY() + (getHeight()/2));
  }

  public void render(Graphics2D g2, Rectangle bounds, double off){
g2.setColor(Color.gray);
g2.fillPolygon(current);
g2.setColor(Color.BLACK);
g2.drawPolygon(current);
  }
}