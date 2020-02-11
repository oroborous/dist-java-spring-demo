package edu.wctc.coachdemo.v9;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring beans have a lifecycle. When created, first the constructor is called, then dependencies are injected,
 * and then we have the option to run our own initialization method.
 *
 * When the container shuts down, we can specify a cleanup method to run before the bean is destroyed.
 *
 * Adding some diagnostic output helps us visualize this process.
 */
public class BeanLifecycleApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac9.xml");

        // Notice when bean lifecycle methods are called?

        // retrieve beans from Spring container
        Coach2 theCoach = context.getBean("myCoach", Coach2.class);

        // call methods
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
