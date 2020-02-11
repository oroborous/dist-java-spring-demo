package edu.wctc.coachdemo.v7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Another option is to use setter injection, but read the literal values from
 * a separate properties file, rather than hardcode them in the XML
 *
 * Still, we can't use the Coach interface if we want to call the getters because
 * they're not defined in the interface
 */
public class PropertiesFileApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac7.xml");

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
