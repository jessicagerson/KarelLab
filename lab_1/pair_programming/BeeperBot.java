package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  J. Gerson
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        int[]things={1, 2, 3};
        Left2();
        move2();
        pickBeeper();
        for (int x : things){
            move3();
            pickBeeper();
            turnRight();
        }
        move3();
        turnLeft();
        move2();
   
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
   
   public void Left2() {
       turnLeft();
       turnLeft();
    }
    
    public void move2() {
        move();
        move();
    }
}