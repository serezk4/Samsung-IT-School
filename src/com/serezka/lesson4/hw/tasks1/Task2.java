package com.serezka.lesson4.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double i = sc.nextDouble();
        System.out.println((i >= -3 && i <= 5) || (i >= 9 && i <= 15));
    }
}
