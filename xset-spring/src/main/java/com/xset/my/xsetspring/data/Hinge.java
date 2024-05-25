package com.xset.my.xsetspring.data;

public class Hinge {

    private String name;

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
