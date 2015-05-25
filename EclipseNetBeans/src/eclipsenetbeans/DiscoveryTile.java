/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eclipsenetbeans;

/**
 *
 * @author Kevin
 */
public class DiscoveryTile {
    private int honorsPoints = 2;
    private int getHonors(){
        return honorsPoints;
    }
    private Upgrades convertTile(){
        honorsPoints = 0;
        //figure out how to force this thing to make an upgrade tile
    }
}
