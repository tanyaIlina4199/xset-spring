package com.xset.my.xsetspring.data;

import org.springframework.stereotype.Component;

@Component
public class Differential {

    private String type;

    public Differential() {
        this.type = "Normal";
    }

    public Differential(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Differential{" +
                "type='" + type + '\'' +
                '}';
    }
}
