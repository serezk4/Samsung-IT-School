package com.serezka.lesson6.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        int num = in.nextInt();
        System.out.println((num < 10 && num > 0 || num == 0) ? "DIGIT" : ((num > 10) && (num < 100) || num == 10) ? "NUM" : "OTHER");
    }
}
