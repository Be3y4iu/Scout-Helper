package com.alekseydorokhov.scouthelper.bean;

public enum Club {
    REAL_MADRID("Real Madrid"),
    LIVERPOOL("Liverpool");

    private final String clubName;

    Club(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }
}
