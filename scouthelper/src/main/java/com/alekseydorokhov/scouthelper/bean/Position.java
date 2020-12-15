package com.alekseydorokhov.scouthelper.bean;

public enum Position {
    GOALKEEPER("GoalKeeper"),
    RIGHT_FULLBACK("Right fullback"),
    LEFT_FULLBACK("Left fullback"),
    CENTRAL_BACK("Central back"),
    CENTRAL_BOXTOBOX_MIDFIELDER("Central box to box midfielder"),
    CENTRAL_MIDFIELDER("Central midfielder"),
    CENTRAL_ATTACKING_MIDFIELDER("Central attacking midfielder"),
    LEFT_MIDFIELDER("Left midfielder"),
    RIGHT_MIDFIELDER("Right midfielder"),
    LEFT_FORWARD("Left forward"),
    RIGHT_FORWARD("Right forward"),
    CENTRAL_FORWARD("Central forward"),
    DRAWN_STRIKER("Drawn striker"),
    FORWARD("Forward");

    private final String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
