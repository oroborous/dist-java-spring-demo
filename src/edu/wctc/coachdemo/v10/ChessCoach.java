package edu.wctc.coachdemo.v10;

import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Study Kasparov vs. Deep Blue";
    }
}
