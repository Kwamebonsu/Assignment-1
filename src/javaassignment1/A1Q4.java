/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author bonsk5852
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kitchener = new City();
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        Robot karel2 = new Robot(kitchener, 0, 1, Direction.SOUTH);
        Robot karel = new Robot (kitchener, 0, 0, Direction.SOUTH);
        karel.move();        
        karel2.move();
        karel.move();
        karel2.turnLeft();
        karel.turnLeft();
         karel2.move();
        karel2.turnLeft();
        karel2.turnLeft();
        karel2.turnLeft();
        karel2.move();
        karel2.turnLeft();
        karel2.turnLeft();
        karel2.turnLeft();
        karel.move();              
        karel2.move();
        
                
        
    }
}
