/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclipsenetbeans;

import eclipsenetbeans.gui.GuiMain;
import eclipsenetbeans.screen.MainMenu;
import eclipsenetbeans.screen.MainBoard;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author yandu5
 */
public class EclipseNetBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameBoard gameboard = new GameBoard();
        try {
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = env.getDefaultScreenDevice();
            new GuiMain(2, device, new MainMenu());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
    
}
