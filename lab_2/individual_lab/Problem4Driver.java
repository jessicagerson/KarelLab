package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 4
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem4Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(1, 1, East, 14);
        //karel.threePlacer();
        karel.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(5);  
        World.setVisible(true);
    }
}