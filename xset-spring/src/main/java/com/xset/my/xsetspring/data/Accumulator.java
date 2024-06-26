package com.xset.my.xsetspring.data;

import org.springframework.stereotype.Component;

@Component
public class Accumulator {

    private String firmName;

    public Accumulator() {
        this.firmName = "Super";
    }

    public Accumulator(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    @Override
    public String toString() {
        return "Accumulator{" +
                "firmName='" + firmName + '\'' +
                '}';
    }
}
