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
public class GalacticCenterDefenseSystem {
    private int damage = 0;
    private final int hull = 7;
    private final int computer = 1;
    private final int initiative = 0;
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
