package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeft();
        move2();
        turnRight();
        move2();
        turnRight();
        pickmove5();
        turnRight();
        move2();
        turnRight();
        move3();
        putBeeper();
        turnRight();
        moveput5();
        rightmove2();
       
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
    public void move3() {
       move();
       move();
       move();
    }
    public void pickmove5() {
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       move();
    }
    public void moveput5() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
     
       
    }
    public void rightmove2() {
        turnRight();
        move2();
        turnRight();
        move2();
        turnRight();
    }
}