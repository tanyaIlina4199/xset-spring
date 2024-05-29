package com.xset.my.xsetspring.data;

import org.springframework.stereotype.Component;

@Component
public class SparkPlug {

    private String name;

    public SparkPlug() {
        this.name = "Spark1";
    }

    public SparkPlug(String name) {
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
        return "SparkPlug{" +
                "name='" + name + '\'' +
                '}';
    }
}
