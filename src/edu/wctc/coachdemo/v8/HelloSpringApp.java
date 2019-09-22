package edu.wctc.coachdemo.v8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_v8.xml");

        // retrieve beans from Spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same bean
        boolean sameObject = theCoach == alphaCoach;

        // print result
        System.out.println("Pointing to same object? " + sameObject);
        // print memory addresses of objects
        System.out.println("Memory location of theCoach: " + theCoach);
        System.out.println("Memory location of alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
