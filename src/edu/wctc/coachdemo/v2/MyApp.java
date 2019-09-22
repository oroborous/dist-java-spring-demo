package edu.wctc.coachdemo.v2;


import org.w3c.dom.ls.LSOutput;

public class MyApp {
    public static void main(String[] args) {
        /**
         * Best practice: Code to the interface.
         * Still not configurable.
         * Implementation is still hardcoded.
         */

        // create the object
        Coach theCoach = new TrackCoach();
        // use the object
        System.out.println(theCoach.getDailyWorkout());


    }

}
