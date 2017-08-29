package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        row1();
        row2();
        row3();
        row4();
        
    }
    public void turnRight(){
     turnLeft();
     turnLeft();
     turnLeft();
    }
    public void move2(){
     move();
     move();
    }
    public void row4(){
     putBeeper();
     turnLeft();
     move2();
     putBeeper();
     move2();
     putBeeper();
     move2();
     putBeeper();
     move();
        
    }
    public void row3(){
        turnRight();
        move();
        putBeeper();
        turnRight();
        move2();
        putBeeper();
        move2();
        putBeeper();
        move();
        turnLeft();
        move();
    }
    public void row2(){
        move();
        turnLeft();
        move();
        putBeeper();
        turnLeft();
        move2();
        putBeeper();
        move();
    }
    public void row1(){
        move();
        putBeeper();
        turnRight();
    }
}

