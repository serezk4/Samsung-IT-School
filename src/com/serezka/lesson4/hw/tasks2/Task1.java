package com.serezka.lesson4.hw.tasks2;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        System.out.println(((x * x) + (y * y) > 4) && (y < x) && (x < 2) ? "YES" : "NO");
    }
}
