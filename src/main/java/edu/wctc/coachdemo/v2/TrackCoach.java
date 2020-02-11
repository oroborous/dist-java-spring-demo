package edu.wctc.coachdemo.v2;

import edu.wctc.coachdemo.iface.Coach;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a 5K";
    }
}
