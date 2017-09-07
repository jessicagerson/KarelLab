package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
}
public void carpetRooms(){
    move();
    turnLeft();
    move();
    carpetTime();
    carpetTime();
    carpetTime();
}
    public void carpetTime(){
    
    if (((!rightIsClear() && !leftIsClear()) && topIsClear()) == true){
        move();
        if (((!rightIsClear() && !leftIsClear()) && topIsClear()) == true){
            move();
            if (((!rightIsClear() && !leftIsClear()) && !topIsClear()) == true){
                turnLeft();
                turnLeft();
                putBeeper();
                move();
                putBeeper();
                move();
                putBeeper();
            }
        }
    }
    else{
        if (((!rightIsClear() && !leftIsClear()) && !topIsClear()) == true){
            putBeeper();
            turnLeft();
            turnLeft();
            move();
            
        }
    }
    turnLeft();
    move();
    turnLeft();
    move();
} 
public boolean leftIsClear(){
    turnLeft();
    if (frontIsClear()){
        return true;
    }
    else{
        return false;
    }
}
public boolean rightIsClear(){
    turnRight();
    if (frontIsClear()){
        return true;
    }
    else{
        return false;
    }
}
public boolean topIsClear(){
    
    if (frontIsClear()){
        return true;
    }
    else{
        return false;
    }
}
}



