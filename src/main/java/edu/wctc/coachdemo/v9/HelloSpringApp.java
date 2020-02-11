package edu.wctc.coachdemo.v9;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
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
