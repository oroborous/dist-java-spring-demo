package edu.wctc.coachdemo.v11;

import edu.wctc.coachdemo.iface.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
