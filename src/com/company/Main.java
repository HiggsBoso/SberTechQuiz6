package com.company;

public class Main {

    public static void main(String[] args) {
        LeagueManager leagueManager = new LeagueManager();
        // Сгененрировать 50 случайных футболистов
        for (int i = 0; i < 50; i++) {
            leagueManager.addPlayer(RandomGeneratorHelper.getRandomSoccerPlayer());
        }
        // Вывести список игроков по странам и лигам, отсортированный по убыванию значения рейтинга
        for (Country country : Country.values()) {
            for (League league : League.values()) {
                System.out.println(country.getCountryName() + "    " + league.getLeagueName());
                for (SoccerPlayer soccerPlayer : leagueManager.getPlayers(country, league)) {
                    System.out.println(soccerPlayer);
                }
                System.out.println("\n");
            }
        }
    }
}
