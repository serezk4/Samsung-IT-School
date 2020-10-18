package com.serezka.lesson2.hw.tasks1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long secs = sc.nextLong();
        System.out.println(getDurationString(secs));
    }

    private static String getDurationString(long seconds) {
        while (seconds >= 86400)
            seconds -= 86400;
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
