package edu.wctc.coachdemo.v5;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;

public class CricketCoach implements Coach2 {
    private FortuneService fortuneService;

    public CricketCoach() {
        // diagnostic message
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        // diagnostic message
        System.out.println("CricketCoach: inside setter setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
