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
 * Write a description of class Battleship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AcientShip extends Ships
{
   
    private int damage = 0;
    private final int hull = 2;
    private final int computer = 1;
    private final int initiative = 2;
    public int getDamage (){
        return damage;
    }
    public boolean isDestroyed(){
        return hull < damage;
    }
    public void hit(int hit){
        damage = damage + hit;
    }
    public void damageReset(){
        damage = 0;
    }
    public int getComputer(){
        return computer;
    }
    public int getInitiative(){
        return initiative;
    }
}

