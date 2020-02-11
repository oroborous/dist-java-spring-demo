package edu.wctc.coachdemo.v2;


import edu.wctc.coachdemo.iface.Coach;

/**
 * It's best practice (Liskov substitution and open/closed principles)
 * to code to an interface. This also enables polymorphism, so we can
 * swap out different kinds of Coaches in the application.
 */
public class MyApp {
    public static void main(String[] args) {
        /**
         * Best practice: Code to the interface.
         * Still not configurable.
         * Implementation is still hardcoded.
         */

        // create the object
        Coach theCoach = new TrackCoach(); // or BaseballCoach()
        // use the object
        System.out.println(theCoach.getDailyWorkout());


    }

}
