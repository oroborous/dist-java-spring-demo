package edu.wctc.coachdemo.v5;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Another option is to give the FortuneService to the Coach via a setter method.
 *
 * We can add some diagnostic output messages to watch how Spring calls the Coach's
 * constructor and the setter
 */
public class SetterInjectionApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac5.xml");

        // retrieve bean from Spring container
        // If there is only one Coach2 bean available, we can omit the bean ID
        Coach2 theCoach = context.getBean(Coach2.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
