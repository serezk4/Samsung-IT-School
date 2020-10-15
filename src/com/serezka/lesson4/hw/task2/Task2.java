package com.serezka.lesson4.hw.task2;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        System.out.println(((x >= 0) && (y <= 0.5) && (x <= 3.14) && (y <= Math.sin(x))) ? "YES" : "NO");
    }
}
