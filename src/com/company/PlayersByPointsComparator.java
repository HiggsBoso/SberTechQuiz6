package com.company;

import java.util.Comparator;

/**
 * Created by Someone on 17.01.2017.
 */
public class PlayersByPointsComparator implements Comparator<SoccerPlayer> {
    @Override
    public int compare(SoccerPlayer o1, SoccerPlayer o2) {
        Integer points1 = o1.getPoints();
        Integer points2 = o2.getPoints();
        if (points1 < points2) {
            return 1;
        }
        else if(points1 > points2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
