package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

/**
 * Created by Someone on 16.01.2017.
 */
public class LeagueManager {

    private List<SoccerPlayer> soccerPlayerList;


    LeagueManager() {
        soccerPlayerList = new ArrayList<>();
    }

    public void addPlayer(SoccerPlayer soccerPlayer) {
        soccerPlayerList.add(soccerPlayer);
    }

    public void removePlayer(SoccerPlayer soccerPlayer) {
        soccerPlayerList.remove(soccerPlayer);
    }

    public SoccerPlayer getPlayer(String name) {
        for (SoccerPlayer soccerPlayer : soccerPlayerList
                ) {
            if (soccerPlayer.getNickName().equals(name)) {
                return soccerPlayer;
            }
        }
        return null;
    }


    public Collection<SoccerPlayer> getAllPlayers() {
        return soccerPlayerList;
    }

    public Collection<SoccerPlayer> getPlayers(Country country, League league) {
        ArrayList<SoccerPlayer> listOfLeaguePlayers = new ArrayList<>();
        for (SoccerPlayer soccerPlayer : soccerPlayerList
                ) {
            if (soccerPlayer.getCountry().equals(country)) {
                if (soccerPlayer.getLeague().equals(league)) {
                    listOfLeaguePlayers.add(soccerPlayer);
                }
            }
        }
        listOfLeaguePlayers.sort(new PlayersByPointsComparator());
        return listOfLeaguePlayers;
    }

    public Collection<SoccerPlayer> getPlayers(Country country) {
        ArrayList<SoccerPlayer> listOfCountryPlayers = new ArrayList<>();
        for (SoccerPlayer soccerPlayer : soccerPlayerList
                ) {
            if (soccerPlayer.getCountry().equals(country)) {
                listOfCountryPlayers.add(soccerPlayer);
            }
        }
        listOfCountryPlayers.sort(new PlayersByPointsComparator());
        return listOfCountryPlayers;
    }

    public void addPoints(String name, int points) {
        for (SoccerPlayer soccerPlayer : soccerPlayerList) {
            if (soccerPlayer.getNickName().equals(name)) {
                soccerPlayer.addPoints(points);
            }
        }
    }
}
