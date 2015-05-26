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
public class Monolith
{
    private int honor = 3;
    private String color;
    public Monolith(String player){
        color = player;
    }
    public String getPlayer(){
        return color;
    }
    public int getHonor(){
        return honor;
    }
}
