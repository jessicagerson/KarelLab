package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setPins();
        setTopPins();
    }
    public void setTopPins(){
        bottomRow();
        middleRow();
        topRow();
        turnLeft();
        move();
  
        
    }
    public void bottomRow(){
        turnRight();
        move();
        turnRight();
        move2();
        putBeeper();
        move2();
        putBeeper();
        move2();
        putBeeper();
    }
    public void middleRow(){
        turnLeft();
        move();
        turnLeft();
        move();
        putBeeper();
        move2();
        putBeeper();
    }
    public void topRow(){
        turnRight();
        move();
        turnRight();
        move();
        putBeeper();
    }
}
