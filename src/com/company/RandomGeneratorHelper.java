package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Someone on 16.01.2017.
 */
public class RandomGeneratorHelper {
    private static Random random = new Random();
    private static List<Country> COUNTRIES = Arrays.asList(Country.values());
    private static List<League> LEAGUES = Arrays.asList(League.values());
    private static final int NUMBER_OF_COUNTRIES = COUNTRIES.size();
    private static final int NUMBER_OF_LEAGUES = LEAGUES.size();


    public static String getRandomName(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] name = new char[length];
        for (int i = 0; i < length; i++) {
            name[i] = alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return new String(name);
    }

    public static int getRandomPoints(int threshold) {
        return random.nextInt(threshold);
    }

    public static Country getRandomCountry() {
        return COUNTRIES.get(random.nextInt(NUMBER_OF_COUNTRIES));
    }

    public static League getRandomLeague() {
        return LEAGUES.get(random.nextInt(NUMBER_OF_LEAGUES));
    }

    public static SoccerPlayer getRandomSoccerPlayer() {
        SoccerPlayer soccerPlayer = new SoccerPlayer();
        int nameLength = 7;
        int maxPoints = 100;

        soccerPlayer.setNickName(getRandomName(nameLength));
        soccerPlayer.setPoints(getRandomPoints(maxPoints));
        soccerPlayer.setCountry(getRandomCountry());
        soccerPlayer.setLeague(getRandomLeague());
        return soccerPlayer;
    }
}
