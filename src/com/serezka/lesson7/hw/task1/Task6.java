package com.serezka.lesson7.hw.task1;

import java.util.Locale;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №6

Ввести с клавиатуры нечетное натуральное число N (25<N<100).
Найти сумму всех четных чисел в диапазоне от 25 до N.
Вывести результат на экран.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int num = sc.nextInt();
        int result = 0;
        for (int i = 25; i <= num; i++)
            if (i % 2 == 0)
                result += i;
        System.out.println(result);
    }
}
