package com.serezka.lesson2.hw.task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        a *= n;
        b *= n;
        a += b / 100;
        b -= (b / 100) * 100;

        System.out.printf(String.format("%d %d", a, b));
    }
}
