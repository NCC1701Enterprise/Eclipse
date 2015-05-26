package eclipsenetbeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Starbase extends Ships{
    private int damage = 0;
    private int hull = 0;
    private int shield = 0;
    private int[] slots;
    private int computer = 0;
    private int initiative = 0;
    private int reactor = 0;
    private String color;
    
    public Starbase(String player,int Reactor, int Hull, int Shield, int Computer, int Initiative){
        this.addShield(Shield);
        this.addComputer(Computer);
        this.increaseHull(Hull);
        this.increasePower(Reactor);
        this.increaseInitiative(Initiative);
        color = player;
    }
    
    public String getColor(){
        return color;
    }
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
    public int getShield(){
        return shield;
    }
    public void addShield(int upgrade){
        shield = shield + upgrade;
    }
    public void decreaseShield(int downgrade){
        shield = shield - downgrade;
    }
    public int getComputer(){
        return computer;
    }
    public void addComputer(int upgrade){
        computer = computer + upgrade;
    }
    public void decreaseComputer (int downgrade){
        computer = computer - downgrade;
    }
    public void increaseInitiative(int increase){
        initiative = initiative + increase;
    }
    public void decreaseInitiative(int decrease){
        initiative = initiative - decrease;
    }
    public int getInitiative(){
        return initiative;
    }
    public void increaseHull(int increase){
        hull = hull + increase;
    }
    public void decreaseHull(int decrease){
        hull = hull - decrease;
    }
    public int getReactor(){
        return reactor;
    }
    public void increasePower(int increase){
        reactor = reactor + increase;
    }
    public void decreasePower (int decrease){
        reactor = reactor - decrease;
    }
   
}
