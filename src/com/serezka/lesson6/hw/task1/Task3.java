package com.serezka.lesson6.hw.task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if ((n % 100 == 1 || n % 10 == 1) && (n % 100 != 11)) {
            System.out.println(n + " TOPT");
        }
        if (n % 100 < 21) {
            if (n % 100 > 4 && n % 100 < 21 || n == 0) {
                System.out.println(n + " TOPTOB");
            } else {
                if (n % 100 > 1 && n % 100 < 5) {
                    System.out.println(n + " TOPTA");
                }
            }
        }

        if (n % 100 > 21) {
            if (n % 10 > 1 && n % 10 < 5) {
                System.out.println(n + " TOPTA");
            } else {
                if (n % 10 > 4) {
                    System.out.println(n + " TOPTOB");
                }
            }
        }
    }
}
