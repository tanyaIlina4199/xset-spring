package com.xset.my.xsetspring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Suspension {

    private Hinge hinge;

    @Autowired
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
