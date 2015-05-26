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
    private boolean Artifact;
    private int AcientShips;
    private final int honor;
    public SpaceHex(int num, int m, int r, int t, boolean artifact, int AcientShip, int HonorPoints){
        PriorityNumber = num;
        Artifact = artifact;
        for(int i = 0; i < AcientShip; i++){
            AcientShip acient = new AcientShip();
        }
        honor = HonorPoints;
        money  = new PopulationCubes[m];
        resources = new PopulationCubes[r];
        technology = new PopulationCubes[t];
    }
    public void addInfluenceTiles(InfluenceTiles tile){
        influence [0] = tile;
    }
    public void removeInfluenceTiles(){
        influence [0] = null;
    }
    public void addNumber(int num){
        PriorityNumber = num;
    }
    public int getPriorityNumber(){
        return PriorityNumber;
    }
    public void buildMonolith(Monolith mon){
        monolith[0] = mon;
    }
    public void removeMonolith(){
        monolith[0] = null;
    }
    public void buildOrbital(Orbital orb){
        orbital[0] = orb;
    }
    public void removeOrbital(){
        orbital[0] = null;
    }
}
