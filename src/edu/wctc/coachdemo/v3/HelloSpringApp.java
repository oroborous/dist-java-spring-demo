package edu.wctc.coachdemo.v3;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inversion of control (IoC)
 *
 * Create and manage objects dynamically
 *
 * Application asks Spring, "give me a Coach object"
 */
public class HelloSpringApp {

    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v3.xml");

        // retrieve bean from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
