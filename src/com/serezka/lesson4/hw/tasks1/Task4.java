package com.serezka.lesson4.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int i = sc.nextInt();
        String strI = String.valueOf(i);
        System.out.println(i % 5 == 0 && strI.length() == 3);
    }
}
