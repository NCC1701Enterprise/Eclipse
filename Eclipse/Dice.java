
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    private int dice = 1;
    private int getRool (){
        dice = (int)(Math.random()*6)+1;
        return dice;
    }
}
