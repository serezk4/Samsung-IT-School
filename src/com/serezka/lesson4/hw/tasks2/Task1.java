package com.serezka.lesson4.hw.tasks2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if ((x < 2) && (y < x) && ((x * x + y * y) > 4) && (y > 0)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
