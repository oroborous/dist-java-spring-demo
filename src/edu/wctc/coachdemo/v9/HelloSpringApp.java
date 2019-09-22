package edu.wctc.coachdemo.v9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v9.xml");

        // retrieve beans from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
