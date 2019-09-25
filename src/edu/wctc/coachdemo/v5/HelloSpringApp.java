package edu.wctc.coachdemo.v5;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v5.xml");

        // retrieve bean from Spring container
        Coach2 theCoach = context.getBean("myCricketCoach", Coach2.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
