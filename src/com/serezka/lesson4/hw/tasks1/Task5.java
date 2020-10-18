package com.serezka.lesson4.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i : arr) {
            for (int j : arr) {
                if (-i == j && i != j) {
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);
    }
}
