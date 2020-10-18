package com.serezka.lesson4.hw.tasks2;

import java.util.Locale;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((y < 1 && x < 1) && x + y == -1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
