package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        turnRight();
        move3();
        putBeeper();
        Left2();
        move3();
        turnRight();
        
    }
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        move2();
        putBeeper();
        Left2();
        move2();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
    public void move3() {
        move();
        move();
        move();
        
    }
    public void move2() {
        move();
        move();
       
        
    }
    public void Left2() {
        turnLeft();
        turnLeft();
        
    }
}