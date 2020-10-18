package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №6: "Две одинаковые цифры рядом"

Напишите программу, которая определяет, верно ли, что введённое число содержит две одинаковых цифры, стоящие рядом (как, например, 221).

> Входные данные: Входная строка содержит одно натуральное число.
> Выходные данные: Программа должна вывести слово 'YES', если в числе есть две одинаковые цифры, стоящие рядом, и слово 'NO', если такой пары цифр нет.

✅ 1,00/1,00
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int lastEl = num % 10;
        while (num > 0) {
            num /= 10;
            int currEl = num % 10;
            if (currEl == lastEl) {
                System.out.println("YES");
                return;
            }
            lastEl = currEl;
        }
        System.out.println("NO");
    }
}
