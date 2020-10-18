package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №7: "Проверка на простоту"

Проверьте, является ли число простым.

> Входные данные: Вводится одно число n.
> Выходные данные: Необходимо вывести  строку prime, если число простое, или composite, если число составное.

✅ 1,00/1,00
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(isPrime(new Scanner(System.in).nextInt()) ? "prime" : "composite");
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
