package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void topRow(){
        putBeeper();
        move3();
        putBeeper();
        move2();
        putBeeperMoveX3();
        move2();
        putBeeper();
        move4();
        putBeeper();
        move4();
      
        putBeeperMoveX3();
        
        move();
      
    }
    public void secondRow(){
        putBeeper();
        move3();
        putBeeper();
        move2();
        putBeeper();
        move4();
        putBeeper();
        move4();
        putBeeper();
        move4();
        putBeeper();
        move2();
        putBeeper();
        move();
        
       
    }
    public void middleRow(){
        putBeeperMoveX3();
        move();
        putBeeper();
        move2();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move2();
        putBeeper();
        move4();
        putBeeper();
        move4();
        putBeeper();
        move2();
        putBeeper();
        move();
        
    }
    public void lastRow(){
        putBeeper();
        move3();
        putBeeper();
        move2();
        putBeeperMoveX3();
        move2();
        putBeeperMoveX3();
        move2();
        putBeeperMoveX3();
        move2();
        putBeeperMoveX3();
        move();
        
        
    }
    public void move3(){
        move();
        move();
        move();
    }
     public void move4(){
        move();
        move();
        move();
        move();
    }
     public void move2(){
        move();
        move();
    }
     public void putBeeperMoveX3(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
  }
