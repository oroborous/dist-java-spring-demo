package edu.wctc.coachdemo.v4;

public class ChessCoach implements Coach {
    private FortuneService fortuneService;

    public ChessCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Review Kasparov vs. Deep Blue";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
