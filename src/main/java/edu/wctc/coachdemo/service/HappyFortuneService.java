package edu.wctc.coachdemo.service;

import edu.wctc.coachdemo.iface.FortuneService;

/**
 * Dependency interface class
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will meet a new friend";
    }
}
