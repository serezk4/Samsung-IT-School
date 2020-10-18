package com.serezka.lesson2.hw.tasks2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((int) (Math.pow(a, 2) + Math.pow(b, 2)));
    }
}
