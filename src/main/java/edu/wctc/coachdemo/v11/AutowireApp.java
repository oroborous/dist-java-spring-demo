package edu.wctc.coachdemo.v11;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring creates the Coach automatically via component scanning. But how does the Coach
 * get its required FortuneService?
 *
 * If the HappyFortuneService is also a @Component, Spring will create and manage it. In TennisCoach,
 * we tell Spring to autowire the FortuneService dependency. Spring will see that
 * HappyFortuneService can satisfy that dependency and will provide it to the TennisCoach.
 */
public class AutowireApp {
    public static void main(String[] args) {
        // read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac11.xml");

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
