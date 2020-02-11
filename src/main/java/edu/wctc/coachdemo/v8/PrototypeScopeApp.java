package edu.wctc.coachdemo.v8;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * By default, Spring only instantiates a bean once. They are singletons. If you ask
 * for the same bean more than once, Spring will check if it already has one before
 * it creates a new one.
 *
 * You can change the bean scope to prototype, which forces Spring to make a new
 * one for every request.
 */
public class PrototypeScopeApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac8.xml");

        // retrieve beans from Spring container
        Coach2 theCoach = context.getBean("myCoach", Coach2.class);
        Coach2 alphaCoach = context.getBean("myCoach", Coach2.class);

        // check if they are the same bean
        boolean sameObject = theCoach == alphaCoach;

        // print result
        System.out.println("Pointing to same object? " + sameObject);
        // print memory addresses of objects using implicit call to toString method
        System.out.println("Memory location of theCoach: " + theCoach);
        System.out.println("Memory location of alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
