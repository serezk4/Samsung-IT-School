package com.serezka.lesson3.hw.tasks1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int removeBits = sc.nextInt();

        System.out.println(num != 0 ? num & -(1 << removeBits) : num);
    }
}
