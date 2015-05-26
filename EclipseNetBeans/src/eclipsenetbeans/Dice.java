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
public class Dice
{
    private int dice = 1;
    public Dice(){
        this.getRool();
    }
    public int getRool (){
        dice = (int)(Math.random()*6)+1;
        return dice;
    }
}