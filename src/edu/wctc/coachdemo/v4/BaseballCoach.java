package edu.wctc.coachdemo.v4;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    /**
     * Constructor for dependency injection
     *
     * @param theFortuneService
     */
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        // use fortune service
        return fortuneService.getFortune();
    }
}
