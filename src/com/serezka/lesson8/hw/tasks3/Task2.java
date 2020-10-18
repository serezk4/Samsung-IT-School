package com.serezka.lesson8.hw.tasks3;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №2: "A[0], A[2], A[4], ..."

Дан массив, состоящий из целых чисел. Нумерация элементов начинается с 0.
Напишите программу, которая выведет элементы массива, номера которых четны (0, 2, 4...).

> Входные данные: Сначала задано число N — количество элементов в массиве (1N100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
> Выходные данные: Необходимо вывести все элементы массива с чётными номерами.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // find even indexes and print values
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int n = sc.nextInt();
            if (i % 2 == 0)
                System.out.print(String.valueOf(n).concat(" "));
        }
    }
}
