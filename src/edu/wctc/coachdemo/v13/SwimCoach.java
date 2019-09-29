package edu.wctc.coachdemo.v13;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;

// POJO with no annotations
public class SwimCoach implements Coach2 {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1 mile";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
