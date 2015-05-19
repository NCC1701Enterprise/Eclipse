
/**
 * Write a description of class Cruiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cruiser extends Ships
{
    private int damage = 0;
    private int power = 0;
    private int hull = 0;
    private int shield = 0;
    private int PowerConsumption = 0;
    private int[] slots;
    private int computer = 0;
    
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
    private int getPower(){
        return power;
    }
    private void increasePower(int increase){
        power = power + increase;
    }
    private void decreasePower(int decrease){
        power = power - decrease;
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
}
