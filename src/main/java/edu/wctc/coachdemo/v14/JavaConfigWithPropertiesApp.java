package edu.wctc.coachdemo.v14;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This application uses Java configuration and @Bean methods. It injects the beans with
 * properties from a file, identified by a @PropertySource annotation.
 */
public class JavaConfigWithPropertiesApp {
    public static void main(String[] args) {
        // Uses the Java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);

        // use default bean ID to retrieve bean from container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeamName());

        // close container
        context.close();
    }
}
