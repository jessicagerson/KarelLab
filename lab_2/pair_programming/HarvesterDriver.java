package lab_2.pair_programming;

import kareltherobot.*; 
import java.awt.Color;
/**
 * Write a description of class HarvesterDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HarvesterDriver implements Directions
{
    public static void main(String[] args) {
        Harvester harry = new Harvester(2,2, East, 0);
        Harvester paul = new Planter(2,2, East, 30);
        harry.harvest();
        paul.harvest();
        harry.putback();
        paul.putback();
        harry.turnOff();
        paul.turnOff();
    }
    
    static {
        World.reset(); 
        World.readWorld("worlds/harvester.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}


