package com.serezka.lesson3.hw.task1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int set = sc.nextInt();

        System.out.println(num ^ (1 << set));
    }
}
