package lab_2.pair_programming;

import kareltherobot.*; 
/**
 * Write a description of class Planter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planter extends HarvesterSolution
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Planter
     */
    public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
   
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
