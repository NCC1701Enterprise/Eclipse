package eclipsenetbeans;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yandu5
 */
public class PlayerBoard {
    Stack<PopulationCubes> moneyTrack = new Stack<PopulationCubes>();
    Stack<PopulationCubes> resourceTrack = new Stack<PopulationCubes>();
    Stack<PopulationCubes> techTrack = new Stack<PopulationCubes>();
    Stack<InfluenceTiles> influenceTile = new Stack<InfluenceTiles>();
    private int money;
    private int resource;
    private int tech;
    private int honorsPoints = 0;
    public void addPoints(int increase){
        honorsPoints = honorsPoints + increase;
    }
    public void decreasePoints(int decrease){
        honorsPoints = honorsPoints - decrease;
    }
    public PlayerBoard(String color, int startMoney, int startResource, int startTech){
    for(int i = 0; i<11;i++){
        moneyTrack.push (new PopulationCubes(color));
        resourceTrack.push (new PopulationCubes(color));
        techTrack.push (new PopulationCubes(color));
        money = startMoney;
        resource = startResource;
        tech = startTech;
    }
    }
    public void addMoney(int add){
        money = money + add;
    }
    public void addResource(int add){
        resource = resource + add;
    }
    public void addTech(int add){
        tech = tech + add;
    }
    public void removeMoney(int remove){
        money = money - remove;
    }
    public void removeResource(int remove){
        resource = resource - remove;
    }
    public void removeTech(int remove){
        tech = tech - remove;
    }
    
}
