package com.alekseydorokhov.scouthelper.bean;

public enum WorkingLeg {
    LEFT("Left"),
    RIGHT("Right"),
    ANY("Any");

    private final String legName;

    WorkingLeg(String legName) {
        this.legName = legName;
    }

    public String getLegName() {
        return legName;
    }
}
