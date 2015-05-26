package eclipsenetbeans.screen;

import eclipsenetbeans.gui.widgets.Label;
import eclipsenetbeans.gui.widgets.WidgetScreen;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;
import java.awt.Graphics;
import java.lang.Object;


/**
 *
 * @author joshuabrot
 */
public class MainBoard extends WidgetScreen {
    public MainBoard () {
        super();
        for(int w = 50; w < 800; w+= 150){
            for(int h = 100; h < 600; w+=100){
                int [] height = new int [6];
                int [] width = new int[6];
                width [0] = w-25;
                width [1] = w+25;
                width [2] = w=50;
                width [3] = w+25;
                width [4] = w-25;
                width [5] = w-50;
                height [0] = h-50;
                height [1] = h-50;
                height [2] = h;
                height [3] = h+50;
                height [4] = h+50;
                height [5] = h;
                drawPolygon(width,height,6);
            }
        }
    
    }
    
    
    
}