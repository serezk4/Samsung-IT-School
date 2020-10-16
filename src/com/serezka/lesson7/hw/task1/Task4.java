package com.serezka.lesson7.hw.task1;

import java.util.Locale;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №4

С клавиатуры вводится два натуральных числа -- A и B.
Вывести на экран частное и остаток от деления A на B, не используя операцию деления.

> Подсказка: нужно вычитать из первого числа второе и считать, сколько раз это получилось сделать.
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int reminder = a % b;
        int splitCount = 0;
        while (a >= b) {
            a -= b;
            splitCount++;
        }

        System.out.printf("%d %d%n", splitCount, reminder);
    }
}
