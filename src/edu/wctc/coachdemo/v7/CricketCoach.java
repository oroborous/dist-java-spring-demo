package edu.wctc.coachdemo.v7;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    // Add new fields for email address and team name
    private String emailAddress;
    private String team;

    public CricketCoach() {
        // diagnostic message
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        // diagnostic message
        System.out.println("CricketCoach: inside setter setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        // diagnostic message
        System.out.println("CricketCoach: inside setter setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        // diagnostic message
        System.out.println("CricketCoach: inside setter setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
