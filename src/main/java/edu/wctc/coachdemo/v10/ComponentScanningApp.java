package edu.wctc.coachdemo.v10;

import edu.wctc.coachdemo.iface.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Rather than add every bean to the XML, we can tell Spring to find them itself. We identify beans
 * with the @Component annotation on the class. Spring will scans the packages we tell it contains
 * beans and create any @Components it finds.
 *
 * We can give a bean an ID using the annotation's element, or we can let it default to the class
 * name with an initial lowercase letter.
 */
public class ComponentScanningApp {
    public static void main(String[] args) {
        // read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ac10.xml");

        // get bean from Spring container
        Coach coach1 = context.getBean("toughCoach", Coach.class);

        // use default bean ID to retrieve bean from container
        Coach coach2 = context.getBean("chessCoach", Coach.class);

        // What if we asked for a non-existent bean ID?

        // call methods on bean
        System.out.println(coach1.getDailyWorkout());

        System.out.println(coach2.getDailyWorkout());

        // close container
        context.close();
    }
}
