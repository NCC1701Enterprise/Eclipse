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
    public GalacticCenterDefenseSystem(){
        this.damageReset();
    }
    private int getDamage (){
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
