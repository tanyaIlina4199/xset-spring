package com.xset.my.xsetspring.data;

public class SparkPlug {

    private String name;

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
