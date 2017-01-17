package com.company;

/**
 * Created by Someone on 17.01.2017.
 */
public enum League {
    PREMIER_LEAGUE("Премьер-лига"), FIRST_DIVISION("Первый дивизион"), SECOND_DIVISION("Второй дивизион");

    String leagueName;
    League(String leagueName) {
        this.leagueName = leagueName;
    }
    public String getLeagueName() {
        return leagueName;
    }
}
