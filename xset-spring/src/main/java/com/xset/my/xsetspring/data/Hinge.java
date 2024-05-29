package com.xset.my.xsetspring.data;

import org.springframework.stereotype.Component;

@Component
public class Hinge {

    private String name;

    public Hinge() {
        this.name = "Good";
    }

    public Hinge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hinge{" +
                "name='" + name + '\'' +
                '}';
    }
}
