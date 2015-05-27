/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclipsenetbeans.screen;

import eclipsenetbeans.gui.widgets.HexTile;
import eclipsenetbeans.gui.widgets.Label;
import eclipsenetbeans.gui.widgets.WidgetScreen;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Button;

/**
 *
 * @author joshuabrot
 */
public class MainMenu extends WidgetScreen {
    public MainMenu () {
        super();
        
        //Now add the widgets!
        Font f = new Font("Arial",Font.PLAIN,12);
        Rectangle loc = new Rectangle(100,100,200,50);
        Label l = new Label (loc,"Hello world!",f,Color.green);
        addWidget(l);
        for(int x = 10; x < 800; x+= 30){
            for(int y = 20; y < 600; y+=20){
                HexTile hexes = new HexTile(x,y) {};
                addWidget(hexes);
            }
        }
    }
}
