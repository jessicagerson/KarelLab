package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Problem3
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void threePlacer(){
        move();
        putBeeperMoveX3();
        turnLeft();
        movePutBeeperX2();
        turnLeft();
        movePutBeeperX2();
    }
    public void threePicker(){
        
    }
    public void twoPlacer(){
        
    }
    public void twoPicker(){
        
    }
    public void onePlacer(){
        
    }
    public void onePicker(){
        
    }
    public void movePutBeeperX2(){
        move();
        putBeeper();
        move();
        putBeeper();
    }
}
