package edu.wctc.coachdemo.v1;

/**
 * This simple application creates a BaseballCoach object
 * and asks it to print you a daily workout recommendation
 */
public class MyApp {
    public static void main(String[] args) {
        // create the object
        BaseballCoach theCoach = new BaseballCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
