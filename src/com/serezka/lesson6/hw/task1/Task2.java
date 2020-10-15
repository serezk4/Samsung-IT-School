package com.serezka.lesson6.hw.task1;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        Set<Integer> nums = new TreeSet<>();
        for (int i = 0; i < 3; i++)
            nums.add(sc.nextInt());

        for (int i : nums)
            System.out.print(i + " ");
    }
}
