package com.serezka.lesson7.hw.tasks1;

import java.util.Locale;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №3

С клавиатуры вводятся двузначные числа (натуральные), пока не будет введено другое число.
Вывести на экран сумму цифр во всех двузначных числах.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int result = 0;
        int n;
        while ((n = sc.nextInt()) < 100 && n >= 10)
            result += (n / 10) + (n % 10 % 10);
        System.out.println(result);
    }
}
