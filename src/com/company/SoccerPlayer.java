package com.company;

/**
 * Created by Someone on 03.12.2016.
 */
public class SoccerPlayer {
    private String nickName;
    private Integer points;
    private League league;
    private Country country;

    public String getNickName() {
        return nickName;
    }

    public Integer getPoints() {
        return points;
    }

    public League getLeague() {
        return league;
    }

    public Country getCountry() {
        return country;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    SoccerPlayer() {
    }

    @Override
    public String toString() {
        return nickName + "      " + points;
    }
}
