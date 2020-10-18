package com.serezka.lesson3.hw.tasks1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a == 0 ? 1 : 2 << a - 1);
    }
}
