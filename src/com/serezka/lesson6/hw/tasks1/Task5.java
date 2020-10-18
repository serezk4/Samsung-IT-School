package com.serezka.lesson6.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a = sc.nextInt();
        double b = sc.nextInt();

        if (a <= 0 && b <= 0 )
            System.out.println("no such x");
        else if (a > 0 && b > 0)
            System.out.println("any x");
        else if (a > 0)
            System.out.println(String.format("x<%.1f or x>%.1f%n", b / a, (-1) * b / a).replace(',', '.'));
        else if (a < 0)
            System.out.println(String.format("%.1f<x<%.1f%n", b / a, (-1) * b / a).replace(',', '.'));
        else
            System.out.println("any x");
    }
}
