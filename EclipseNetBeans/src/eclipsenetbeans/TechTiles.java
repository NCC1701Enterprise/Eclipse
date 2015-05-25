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
public class TechTiles {
    private String name;
    private int LowestCost;
    private int HighestCost;
    public TechTiles (String str, int Highest, int Lowest){
        name = str;
        LowestCost = Lowest;
        HighestCost = Highest;
    }
    private int getLowestCost(){
        return LowestCost;
    }
    private int getHighestCost(){
        return HighestCost;
    }
}
