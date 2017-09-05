package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
        goToRoom();
        checkSurroundings();
      
        
    }
    public void  goToRoom(){
        move();
        turnLeft();
        move();
        turnRight();
    }
    public void checkSurroundings(){
        if (!frontIsClear()){
            turnLeft();
            if (!frontIsClear()){
                turnLeft();
                if (!frontIsClear()){
                    putBeeper();
                    leaveRoom();
                }
                else{
                    leaveRoom();
                }
                }
            else{
               turnLeft();
               leaveRoom();
            }
         
            }
        
        else{
            turnLeft();
            turnLeft();
            leaveRoom();
        }
    }
    public void leaveRoom(){
        turnLeft();
        move();
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

