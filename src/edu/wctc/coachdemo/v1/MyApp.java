package edu.wctc.coachdemo.v1;

/**
 * Main application class
 */
public class MyApp {
    public static void main(String[] args) {
        // create the object
        BaseballCoach theCoach = new BaseballCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
