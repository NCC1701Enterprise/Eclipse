package eclipsenetbeans.screen;

import eclipsenetbeans.gui.widgets.Label;
import eclipsenetbeans.gui.widgets.WidgetScreen;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import java.awt.Graphics;
import java.lang.Object;
import java.awt.Graphics2D;
import eclipsenetbeans.gui.widgets.HexTile;
/**
 *
 * @author joshuabrot
 */
public class MainBoard extends WidgetScreen {
    public MainBoard () {
        super();
        for(int x = 10; x < 800; x+= 30){
            for(int y = 20; y < 600; y+=20){
                HexTile hexes = new HexTile(x,y) {};
                addWidget(hexes);
            }
        }
    
    }  
}