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
 * Write a description of class Ambassador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambassador
{
    private final int honorsPoints = 1;
    private PopulationCubes[] pop = new PopulationCubes[1];
    private void addPopulation(PopulationCubes pops){
        pop[0] = pops;
    }
    private void removePopulation(){
        pop[0] = null;
    }
    private int getHonors(){
        return honorsPoints;
    }
}

