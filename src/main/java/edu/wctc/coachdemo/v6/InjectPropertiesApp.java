package edu.wctc.coachdemo.v6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This CricketCoach has some fields that not all Coaches have, so they're not
 * part of the Coach interface.
 *
 * We can configure Spring to call the setter methods for these fields and
 * fill in their values.
 *
 * Of course, if we want to call the getters, we need to reference the concrete
 * type (CricketCoach) instead of the interface
 */
public class InjectPropertiesApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac6.xml");

        // retrieve bean from Spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // call getters for literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the context
        context.close();
    }
}
