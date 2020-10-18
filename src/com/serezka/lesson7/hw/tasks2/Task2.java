package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №2: "Произведение"

Напишите программу, которая вводит два целых числа и находит их произведение, не используя операцию умножения. Учтите, что числа могут быть отрицательными.

> Входные данные: Входная строка содержит два целых числа.
> Выходные данные: Программа должна вывести произведение введённых чисел.

✅ 1,00/1,00
 */

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a;
        if (b > 0)
            for (int i = 1; i < b; i++)
                result += a;
        else if (b < 0)
            for (int i = b-1; i < 0; i++)
                result -= a;
        else
            result = 0;

        System.out.println(result);
    }
}
