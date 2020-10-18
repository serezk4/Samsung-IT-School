package com.serezka.lesson4.hw.tasks2;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        boolean valid = sqr(x) + sqr(y) <= 1;
        if ((valid && (y >= x)) || (valid && (x <= 0)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static double sqr(double n) {
        return n * n;
    }
}
