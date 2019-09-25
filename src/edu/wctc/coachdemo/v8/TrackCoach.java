package edu.wctc.coachdemo.v8;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;

public class TrackCoach implements Coach2 {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
