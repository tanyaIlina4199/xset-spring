package com.xset.my.xsetspring.data;

public class Starter {

    private String type;

    public Starter(String type) {
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
        return "Starter{" +
                "type='" + type + '\'' +
                '}';
    }
}
