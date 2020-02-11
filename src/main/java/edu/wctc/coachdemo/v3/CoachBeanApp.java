package edu.wctc.coachdemo.v3;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * We're using Spring to perform inversion of control (IoC)
 *
 * Spring creates the Coach object based on its XML configuration file
 *
 * Application asks Spring, "give me a Coach object"
 *
 * Not dependency injection, more service locator pattern
 */
public class CoachBeanApp {

    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac3.xml");

        // retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
