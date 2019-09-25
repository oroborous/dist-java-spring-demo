package edu.wctc.coachdemo.v10;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.stereotype.Component;

@Component("toughCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
