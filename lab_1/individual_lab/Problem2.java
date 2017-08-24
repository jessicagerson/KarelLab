package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        firstLoop();
   
        secondLoop();
        
        
    }
    public void firstLoop() {
        turnLeft();
        move();
        turnRight();
        move2();
        turnRight();
        Leftmove2x4();
       
     
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2() {
        move();
        move();
    }
    public void secondLoop() {
        move2();
        turnRight();
        move2();
        turnRight();
        move();
        turnRight();
    }
    public void Leftmove2x4() {
        move2();
        turnLeft();
        move2();
        turnLeft();
        move2();
        turnLeft();
        move2();
        turnLeft();
    }
}