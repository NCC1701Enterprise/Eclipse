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
 * Write a description of class Orbital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orbital
{
    private PopulationCubes[] pop = new PopulationCubes[1];
    private String color;
    public Orbital(String player){
        color = player;
    }
    public String getPlayer(){
        return color;
    }
    public boolean addPopulation(PopulationCubes populate){
        if(populate.getPlayer().equals(color)){
            pop[0]= populate;
            return true;
        }
        else{
            return false;
        }
    }
}