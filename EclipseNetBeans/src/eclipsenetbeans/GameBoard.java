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
public class GameBoard {
private TechTiles [] randomList = new TechTiles[96];
for(int i = 0; i<5; i++){
    TechTiles NeutronBombs = new TechTiles("Neutron Bombs", 2,2);
    randomList[i] = NeutronBombs;
}
for(int i = 5;i<10;i++){
    TechTiles Starbase = new TechTiles("Starbase", 4,3);
    randomList[i] = Starbase;
}
for(int i = 10; i < 15; i++){
    TechTiles PlasmaCannon = new TechTiles("Plasma Cannon", 6,4);
    randomList[i] = PlasmaCannon;
}
for(int i = 15; i <19 ; i++){
    TechTiles PhaseShield = new TechTiles("Phase Shield", 8,5);
    randomList[i] = PhaseShield;
}
for(int i = 19; i < 23; i++){
    TechTiles tech = new TechTiles("Advanced Mining", 10,6);
    randomList[i] = tech;
}
for(int i = 23; i < 26; i++){
    TechTiles tech = new TechTiles("Tachyon Source", 12,6);
    randomList[i] = tech;
}
for(int i = 26; i < 29; i++){
    TechTiles tech = new TechTiles("Plasma Missle", 14,7);
    randomList[i] = tech;
}
for(int i = 29; i < 32; i++){
    TechTiles tech = new TechTiles("Gluon Computer", 16,8);
    randomList[i] = tech;
}
for(int i = 32; i < 37; i++){
    TechTiles tech = new TechTiles("Gauss Shield", 2,2);
    randomList[i] = tech;
}
for(int i = 37; i < 42; i++){
    TechTiles tech = new TechTiles("Improved Hull", 4,3);
    randomList[i] = tech;
}
for(int i = 42; i < 47; i++){
    TechTiles tech = new TechTiles("Fusion Source", 6,4);
    randomList[i] = tech;
}
for(int i = 47; i < 51; i++){
    TechTiles PhaseShield = new TechTiles("Positron Computer", 8,5);
    randomList[i] = tech;
}
for(int i = 51; i < 55; i++){
    TechTiles tech = new TechTiles("Advanced Economy", 10,6);
    randomList[i] = tech;
}
for(int i = 55; i < 58; i++){
    TechTiles tech = new TechTiles("Tachyon Drive", 12,6);
    randomList[i] = tech;
}
for(int i = 58; i < 61; i++){
    TechTiles tech = new TechTiles("AntiMatter Cannon", 14,7);
    randomList[i] = tech;
}
for(int i = 61; i < 64; i++){
    TechTiles tech = new TechTiles("Quantum Grid", 16,8);
    randomList[i] = tech;
}
for(int i = 64; i < 69; i++){
    TechTiles tech = new TechTiles("NanoRobots", 2,2);
    randomList[i] = tech;
}
for(int i = 69; i < 74; i++){
    TechTiles tech = new TechTiles("Fusion Drive", 4,3);
    randomList[i] = tech;
}
for(int i = 74; i < 79; i++){
    TechTiles tech = new TechTiles("Advanced Robotics", 6,4);
    randomList[i] = tech;
}
for(int i = 79; i < 83; i++){
    TechTiles PhaseShield = new TechTiles("Orbital", 8,5);
    randomList[i] = tech;
}
for(int i = 83; i < 87; i++){
    TechTiles tech = new TechTiles("Advanced Labs", 10,6);
    randomList[i] = tech;
}
for(int i = 87; i < 90; i++){
    TechTiles tech = new TechTiles("Monolith", 12,6);
    randomList[i] = tech;
}
for(int i = 90; i < 93; i++){
    TechTiles tech = new TechTiles("Artifact Key", 14,7);
    randomList[i] = tech;
}
for(int i = 93; i < 96; i++){
    TechTiles tech = new TechTiles("WormHole Generator", 16,8);
    randomList[i] = tech;
}
for(int i = 0; i < 48; i++){
    TechTiles temp = randomList[i];
    private int random = Math.random()*96;
    randomList[i] = randomList[random];
    randomList[random] = temp;
}
}
