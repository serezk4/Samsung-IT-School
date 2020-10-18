package com.serezka.lesson2.hw.tasks1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNum = sc.next();
        System.out.println(strNum.substring(strNum.length() - 1));
    }
}
