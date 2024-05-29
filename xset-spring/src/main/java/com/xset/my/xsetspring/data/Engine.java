package com.xset.my.xsetspring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    private Starter starter;

    @Autowired
    public Engine(Starter starter) {
        this.starter = starter;
    }

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "starter=" + starter +
                '}';
    }
}
