package edu.wctc.coachdemo.v11;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// A component is a bean
// Annotating a class as component will cause component scanning to create a bean of this class
@Component
public class TennisCoach implements Coach2 {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
