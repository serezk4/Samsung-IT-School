package com.serezka.lesson2.hw.task2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (String el : String.valueOf(num).split(""))
            result += Integer.parseInt(el);

        System.out.println(result);
    }
}
