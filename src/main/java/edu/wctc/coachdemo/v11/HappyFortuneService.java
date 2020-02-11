package edu.wctc.coachdemo.v11;

import edu.wctc.coachdemo.iface.FortuneService;
import org.springframework.stereotype.Component;

// A component is a bean
// Annotating a class as component will cause component scanning to create a bean of this class
@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
