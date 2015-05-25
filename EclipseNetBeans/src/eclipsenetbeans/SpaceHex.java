package eclipsenetbeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yandu5
 */

/**
 * Write a description of class SpaceHex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceHex
{
    private PopulationCubes[] money;
    private PopulationCubes[] resources;
    private PopulationCubes[] technology;
    private Monolith[] monolith = new Monolith[1];
    private Orbital[] orbital= new Orbital[1];
    private int PriorityNumber;
    private InfluenceTiles[]influence = new InfluenceTiles[1];
    private void addInfluenceTiles(InfluenceTiles tile){
        influence [0] = tile;
    }
    private void removeInfluenceTiles(){
        influence [0] = null;
    }
    private void addNumber(int num){
        PriorityNumber = num;
    }
    private int getPriorityNumber(){
        return PriorityNumber;
    }
    private void buildMonolith(Monolith mon){
        monolith[0] = mon;
    }
    private void removeMonolith(){
        monolith[0] = null;
    }
    private void buildOrbital(Orbital orb){
        orbital[0] = orb;
    }
    private void removeOrbital(){
        orbital[0] = null;
    }
    
}
