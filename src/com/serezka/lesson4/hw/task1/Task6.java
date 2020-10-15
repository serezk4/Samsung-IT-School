package com.serezka.lesson4.hw.task1;

import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int evenNums = 0;
        for (int i = 0; i < 3; i++)
            evenNums += sc.nextInt() % 2 == 0 ? 1 : 0;

        System.out.println(evenNums >= 2);
    }
}
