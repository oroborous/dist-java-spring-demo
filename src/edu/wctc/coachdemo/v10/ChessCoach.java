package edu.wctc.coachdemo.v10;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.stereotype.Component;

// No bean ID given, so default bean name is class name with lowercase first letter
@Component
public class ChessCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Study Kasparov vs. Deep Blue";
    }
}
