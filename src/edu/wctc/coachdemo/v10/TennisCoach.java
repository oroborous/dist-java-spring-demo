package edu.wctc.coachdemo.v10;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.stereotype.Component;

// Specify the bean ID in the annotation
@Component("toughCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
