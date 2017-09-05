package lab_3.pair_programming;

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

    public void checkSurrounded(){
        //initially facing  north
        if (!frontIsClear()){
            turnLeft();
            //facing west
            if (!frontIsClear()){
                turnLeft();
                //facing south
            
                if (!frontIsClear()){
                    turnLeft();
                    //facing east
                    if (!frontIsClear()){
                        turnOff();
                    }
                }
         
         else{
             //
            }   
            }
    }
}
}

