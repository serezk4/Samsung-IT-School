package com.serezka.lesson3.hw.tasks1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reset = sc.nextInt();

        System.out.println(num & ~(num & -(1 << reset)));
    }
}