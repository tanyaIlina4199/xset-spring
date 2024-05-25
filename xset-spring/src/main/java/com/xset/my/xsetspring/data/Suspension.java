package com.xset.my.xsetspring.data;

public class Suspension {

    private Hinge hinge;

    public Suspension(Hinge hinge) {
        this.hinge = hinge;
    }

    public Hinge getHinge() {
        return hinge;
    }

    public void setHinge(Hinge hinge) {
        this.hinge = hinge;
    }

    @Override
    public String toString() {
        return "Suspension{" +
                "hinge=" + hinge +
                '}';
    }
}
