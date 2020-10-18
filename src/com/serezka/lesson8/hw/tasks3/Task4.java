package com.serezka.lesson8.hw.tasks3;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №4: "Количество положительных элементов"

Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитывает количество положительных чисел среди элементов массива.

> Входные данные: Сначала задано число  𝑁 — количество элементов в массиве (1≤𝑁≤10000). Далее через пробел записаны 𝑁 чисел — элементы массива. Массив состоит из целых чисел.
> Выходные данные: Необходимо единственное число - количество положительных элементов в массиве.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // calc positive numbers count
        int positiveNumbersCount = 0;
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int n = sc.nextInt();
            if (n > 0) positiveNumbersCount++;
        }

        // print result
        System.out.println(positiveNumbersCount);
    }
}
