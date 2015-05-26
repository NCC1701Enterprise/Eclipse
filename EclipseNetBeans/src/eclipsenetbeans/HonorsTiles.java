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
public class HonorsTiles {
    int honorPoints;
    public HonorsTiles(){
        int random = (int)(Math.random()*32);
        if (random>=0 && random < 4){
            honorPoints = 4;
        }
        else if (random >=4 && random < 11){
            honorPoints = 3;
        }
        else if (random >=11 && random < 20){
            honorPoints = 2;
        }
        else{
            honorPoints = 1;
        }
    }
    public int getHonors(){
        return honorPoints;
    }
}
