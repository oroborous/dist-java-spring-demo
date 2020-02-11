package edu.wctc.coachdemo.v14;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach2 {

    private FortuneService fortuneService;
    // No setter methods necessary
    // Annotation injects field value from properties file
    @Value("${c1.email}")
    private String email;
    @Value("${c1.team}")
    private String teamName;

    public String getEmail() {
        return email;
    }

    public String getTeamName() {
        return teamName;
    }

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
