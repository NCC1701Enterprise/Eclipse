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
    private String upgrade;
    private int energy;
    private int face = 0;
    public DiscoveryTile(String Name, int Energy){
        upgrade = Name;
        energy = Energy;
    }
    public int getHonors(){
        return honorsPoints;
    }
    public void flip(){
        face++;
    }
    public boolean isHonors(){
        return face%2==0;
    }
    public Upgrades convertTile(){
        honorsPoints = 0;
        Upgrades discovery = new Upgrades(upgrade, energy);
        return discovery;
    }
    public String getName(){
        return upgrade;
    }
}
