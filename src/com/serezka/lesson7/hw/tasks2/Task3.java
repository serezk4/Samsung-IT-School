package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №3: "Первые N чётных"

Напишите программу, которая вводит натуральное число N и выводит первые N чётных натуральных чисел.

> Входные данные: Входная строка содержит единственное число – требуемое количество чисел N .
> Выходные данные: Программа должна вывести в одну строчку N первых чётных натуральных чисел, разделив их пробелами.

✅ 1,00/1,00
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int founded = 0;
        for (int i = 1; i < n || founded < n; i++) {
            if (i % 2 == 0) {
                System.out.print(String.valueOf(i).concat(" "));
                founded++;
            }
        }
    }
}
