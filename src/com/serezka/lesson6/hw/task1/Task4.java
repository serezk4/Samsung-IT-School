package com.serezka.lesson6.hw.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int A = sc.nextInt();
        int B = -sc.nextInt();

        double x1 = (double) B / A;
        double x2 = -((double) B / A);
//        System.out.printf("x1:%.1f x2:%.1f A:%d B:%d %n", x1, x2, A, B);

        if (x1 == Double.POSITIVE_INFINITY || x1 == Double.NEGATIVE_INFINITY)
            System.out.println("no such x");
        else {
            if (x1 < 0 && x2 > 0) {
                System.out.println("any x");
            } else {
                if (A > 0) {
                    System.out.printf("x<%.1f or x>%.1f", Math.min(x1, x2), Math.max(x1, x2));
                } else if (A < 0) {
                    System.out.printf("%.1f<x<%.1f", Math.min(x1, x2), Math.max(x1, x2));
                } else {
                    System.out.println("any x");
                }
            }
        }
    }
}
