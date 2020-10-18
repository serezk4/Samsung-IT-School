package com.serezka.lesson4.hw.tasks2;

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((x + y == 1) || y == x - 1 && y < 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
