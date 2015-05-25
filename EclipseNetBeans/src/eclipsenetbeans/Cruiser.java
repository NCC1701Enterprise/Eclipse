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
 * Write a description of class Cruiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cruiser extends Ships
{
    private int damage = 0;
    private int reactor = 0;
    private int hull = 0;
    private int shield = 0;
    private int[] slots;
    private int computer = 0;
    private int initiative = 0;
    private int drive = 0;
    
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
    private int getShield(){
        return shield;
    }
    private void addShield(int upgrade){
        shield = shield + upgrade;
    }
    private void decreaseShield(int downgrade){
        shield = shield - downgrade;
    }
    private int getComputer(){
        return computer;
    }
    private void addComputer(int upgrade){
        computer = computer + upgrade;
    }
    private void decreaseComputer (int downgrade){
        computer = computer - downgrade;
    }
    private void increaseInitiative(int increase){
        initiative = initiative + increase;
    }
    private void decreaseInitiative(int decrease){
        initiative = initiative - decrease;
    }
    private int getInitiative(){
        return initiative;
    }
        private void increaseHull(int increase){
        hull = hull + increase;
    }
    private void decreaseHull(int decrease){
        hull = hull - decrease;
    }
    private int getReactor(){
        return reactor;
    }
    private void increasePower(int increase){
        reactor = reactor + increase;
    }
    private void decreasePower (int decrease){
        reactor = reactor - decrease;
    }
    private int getDrive(){
        return drive;
    }
    private void increaseDrive(int increase){
        drive = drive + increase;
    }
    private void decreaseDrive(int decrease){
        drive = drive - decrease;
    }
    
}
