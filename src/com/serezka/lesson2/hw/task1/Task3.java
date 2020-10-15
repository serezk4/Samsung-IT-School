package com.serezka.lesson2.hw.task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num - (num % 2) + 2);
    }
}
