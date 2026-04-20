package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] arg) {
        int[] scores = {88, 92, 75, 91, 85, 79, 95, 87, 90, 82};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / 10.0;

        int high = scores[0];
        for (int score : scores) {
            if (score > high) {
                high = score;
            }
        }
        int low = scores[0];
        for (int score : scores) {
            if (score < low) {
                low = score;
            }
            Arrays.sort(scores);
            double median = (scores[4] + scores[5]) / 2.0;

            System.out.println("Average score: " + average);
            System.out.println("High score: " + high);
            System.out.println("Low score: " + low);
            System.out.println("Median score: " + median);

        }
    }
}
