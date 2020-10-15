package com.serezka.lesson2.hw.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String strNum = String.valueOf(num);
        System.out.println(strNum.charAt(strNum.length() - 2));
    }
}
