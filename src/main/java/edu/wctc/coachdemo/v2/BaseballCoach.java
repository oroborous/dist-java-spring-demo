package edu.wctc.coachdemo.v2;

import edu.wctc.coachdemo.iface.Coach;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
