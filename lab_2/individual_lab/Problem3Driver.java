package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(3, 2, East, 14);
        Problem3 larry = new Problem3(4, 2, East, 14);
        Problem3 harry = new Problem3(5, 2, East, 14);
        Problem3 marry = new Problem3(6, 2, East, 14);
        Problem3 jerry = new Problem3(7, 2, East, 14);
        
        jerry.topRow();
        marry.secondRow();
        harry.middleRow();
        larry.secondRow();
        karel.lastRow();
        
        karel.turnOff();
        larry.turnOff();
        harry.turnOff();
        marry.turnOff();
        jerry.turnOff();
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