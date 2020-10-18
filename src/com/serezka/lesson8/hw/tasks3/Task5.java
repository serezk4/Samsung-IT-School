package com.serezka.lesson8.hw.tasks3;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №5: "Количество элементов, больших предыдущего"

Дан массив, состоящий из целых чисел. Напишите программу, которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).

> Входные данные: Сначала задано число N — количество элементов в массиве (1N10000).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
> Выходные данные: Необходимо вывести единственное число - количество элементов массива, больших предыдущего.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int length = sc.nextInt();
        int lastEl = sc.nextInt();
        for (int i = 0; i < length - 1; i++) {
            int currEl = sc.nextInt();
            if (currEl > lastEl) result++;
            lastEl = currEl;
        }

        System.out.println(result);
    }
}
