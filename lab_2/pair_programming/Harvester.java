package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        
        putTwoRows();
        putTwoRows();
        putTwoRows();
    }
    public void putback(){
        moveput5();
    }
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
        
    }
    public void harvestOneRow() {
        movepick5();
    }
    public void repositionRight(){
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionLeft(){
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void movepick5(){
        move();
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
    public void putTwoRows(){
        moveput5();
        moveput5();
    }
    public void moveput5(){
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    /**
     * Precondition: Robot is facing east, one block away from a beeper
     * Postcondition: Robot is facing east, two streets about where it started
     */
    
}

