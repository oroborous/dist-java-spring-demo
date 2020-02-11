package edu.wctc.coachdemo.v4;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * It's a tough time to be a Coach. Now in addition to providing a workout
 * plan, Coaches have to motivate people with a daily fortune.
 *
 * But Coaches don't know how to come up good fortunes, so they rely on a
 * FortuneService to generate one. When our application asks a coach for a
 * fortune, it turns around and asks its FortuneService for one.
 *
 * How does the Coach object get the FortuneService? Spring creates both objects,
 * then inject the service in the coach. This app demonstrates using the Coach's
 * constructor to supply the FortuneService object.
 */
public class ConstructorInjectionApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac4.xml");

        // retrieve bean from Spring container
        Coach2 theCoach = context.getBean("myCoach", Coach2.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
