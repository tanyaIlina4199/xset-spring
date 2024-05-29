package com.xset.my.xsetspring.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Wheel wheel;
    private Engine engine;
    private SparkPlug sparkPlug;
    private Accumulator accumulator;
    private Differential differential;
    private Suspension suspension;

    public Car() {
    }

    @Autowired
    public Car(Wheel wheel, Engine engine, SparkPlug sparkPlug, Accumulator accumulator, Differential differential, Suspension suspension) {
        this.wheel = wheel;
        this.engine = engine;
        this.sparkPlug = sparkPlug;
        this.accumulator = accumulator;
        this.differential = differential;
        this.suspension = suspension;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public SparkPlug getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(SparkPlug sparkPlug) {
        this.sparkPlug = sparkPlug;
    }

    public Accumulator getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(Accumulator accumulator) {
        this.accumulator = accumulator;
    }

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                ", sparkPlug=" + sparkPlug +
                ", accumulator=" + accumulator +
                ", differential=" + differential +
                ", suspension=" + suspension +
                '}';
    }
}
