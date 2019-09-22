package edu.wctc.coachdemo.v9;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void doStartupStuff() {
        System.out.println("TrackCoach: doStartupStuff");
    }

    public void doCleanupStuff() {
        System.out.println("TrackCoach: doCleanupStuff");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a 5K";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
