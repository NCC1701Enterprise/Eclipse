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
    private int hull = 2;
    private int computer = 1;
    private int hit = 1;//two cannons though
    
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
}

