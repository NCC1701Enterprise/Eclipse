/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclipsenetbeans;

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
        EclipseGUI gui = new EclipseGUI(gameboard);
    }
    
}
