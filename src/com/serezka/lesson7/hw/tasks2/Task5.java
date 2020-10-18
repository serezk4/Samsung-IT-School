package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №5: "Сумма цифр"

Напишите программу, которая считает сумму цифр введённого числа.

> Входные данные: Входная строка содержит одно натуральное число.
> Выходные данные: Программа должна вывести сумму цифр введённого числа.

✅ 1,00/1,00
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num/=10;
        }
        System.out.println(sum);
    }
}
