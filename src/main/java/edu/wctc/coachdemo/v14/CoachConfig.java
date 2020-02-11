package edu.wctc.coachdemo.v14;

import edu.wctc.coachdemo.iface.Coach2;
import edu.wctc.coachdemo.iface.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// No component scanning, we will create beans manually
@PropertySource("classpath:coach.properties")
public class CoachConfig {
    // Annotate method as returning a bean
    // Method name becomes the bean ID
    @Bean
    public Coach2 swimCoach() {
        // injects dependency
        return new SwimCoach(luckyFortuneService());
    }

    // Defines a bean for a fortune service
    // Exposes the bean
    @Bean
    public FortuneService luckyFortuneService() {
        // Default scope is singleton
        // @Bean annotation intercepts calls to luckyFortuneService
        // Spring checks if a luckyFortuneService beans exists
        // Returns existing bean if found, creates one if not found
        return new LuckyFortuneService();
    }
}
