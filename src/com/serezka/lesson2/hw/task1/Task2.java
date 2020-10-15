package com.serezka.lesson2.hw.task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = sc.next();
        int result = 0;
        for (String el : strNum.split(""))
            result += Integer.parseInt(el);
        System.out.println(result);
    }
}
