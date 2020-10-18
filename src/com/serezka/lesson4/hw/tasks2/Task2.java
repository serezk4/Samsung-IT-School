package com.serezka.lesson4.hw.tasks2;

import java.util.Scanner;

public class Task2 {
    static boolean isValid(double x, double y) {
        return y >= 0 && y <= 0.5 && x >= 0 && x <= Math.PI;
    }

    static boolean isExcludeS(double x, double y) {
        return y - Math.sin(x) <= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (isValid(x, y) && isExcludeS(x, y)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
