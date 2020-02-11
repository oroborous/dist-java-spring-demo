package edu.wctc.coachdemo.v12;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This application doesn't have an XML file at all. The configuration information is provided by a special
 * @Configuration Java class. In that class, another annotation supplies the packages to scan for
 * @Components.
 */
public class JavaConfigApp {
    public static void main(String[] args) {
        // Uses the Java config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);

        // use default bean ID to retrieve bean from container
        Coach2 theCoach = context.getBean("tennisCoach", Coach2.class);

        // call methods on bean

        // Because there was only one implementation of FortuneService, Spring
        // can autowire the dependency
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close container
        context.close();
    }
}
