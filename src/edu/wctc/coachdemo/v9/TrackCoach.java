package edu.wctc.coachdemo.v9;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;

public class TrackCoach implements Coach2 {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        System.out.println("TrackCoach: inside constructor");
        this.fortuneService = fortuneService;
    }

    // In XML, this method is identified as init method
    public void doStartupStuff() {
        System.out.println("TrackCoach: doStartupStuff");
    }

    // In XML, this method is identified as destroy method
    public void doCleanupStuff() {
        System.out.println("TrackCoach: doCleanupStuff");
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
