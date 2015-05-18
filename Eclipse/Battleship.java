
/**
 * Write a description of class Battleship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Battleship extends Ships
{
    private int damage = 0;
    private int power = 0;
    private int hull = 0;
    private int shield = 0;
    private int PowerConsumption = 0;
    private int[] slots;
    private int comupter = 0;
    
    private int getDamage (){
        return damage;
    }
    private boolean isDestroyed(){
        return hull < damage;
    }
    private hit(int hit){
        damage = damage + hit;
    }
    private damageReset(){
        damage = 0;
    }
    private int getPower(){
        return power;
    }
    private increasePower(int increase){
        power = power + increase;
    }
    private decreasePower(int decrease){
        power = power - decrease;
    }
    private int getShield(){
        return shield;
    }
    private addShield(upgrade){
        shield = shield + upgrade;
    }
    private decreaseShield(downgrade){
        shield = shield - downgrade;
    }
}
