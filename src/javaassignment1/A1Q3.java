/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bonsk5852
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Karel is moving around the walls and returning to his starting position.
        
        City kitchener = new City();
        
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        new Thing(kitchener, 3, 1);
        
        Robot Karel = new Robot(kitchener, 3, 0, Direction.EAST);
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.putThing();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
    }
}
