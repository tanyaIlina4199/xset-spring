package com.xset.my.xsetspring.data;

import org.springframework.stereotype.Component;

@Component
public class Wheel {

    private String name;

    public Wheel() {
        this.name = "Michlenn";
    }

    public Wheel(String name) {
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
        return "Wheel{" +
                "name='" + name + '\'' +
                '}';
    }
}
