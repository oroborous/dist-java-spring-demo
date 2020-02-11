package edu.wctc.coachdemo.v13;

import edu.wctc.coachdemo.iface.FortuneService;

// POJO with no annotations
public class LuckyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will come into some money";
    }
}
