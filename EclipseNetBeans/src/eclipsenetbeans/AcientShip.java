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
    
    private int getDamage (){
        return damage;
    }
    private boolean isDestroyed(){
        return hull < damage;
    }
    private void hit(int hit){
        damage = damage + hit;
    }
    private void damageReset(){
        damage = 0;
    }
    private int getComputer(){
        return computer;
    }
    private int getInitiative(){
        return initiative;
    }
}

