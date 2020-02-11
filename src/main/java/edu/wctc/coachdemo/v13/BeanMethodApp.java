package edu.wctc.coachdemo.v13;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This application uses Java for configuration, but not component scanning. It contains methods
 * annotated with @Bean that create and return the beans. The method name itself becomes the
 * bean ID.
 */
public class BeanMethodApp {
    public static void main(String[] args) {
        // Uses the Java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);

        // use default bean ID to retrieve bean from container
        Coach2 theCoach = context.getBean("swimCoach", Coach2.class);

        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close container
        context.close();
    }
}
