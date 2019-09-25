package edu.wctc.coachdemo.v11;

import edu.wctc.coachdemo.iface.Coach2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        // read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v11.xml");

         // use default bean ID to retrieve bean from container
        Coach2 theCoach = context.getBean("tennisCoach", Coach2.class);

        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close container
        context.close();
    }
}
