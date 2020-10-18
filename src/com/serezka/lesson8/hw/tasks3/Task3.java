package com.serezka.lesson8.hw.tasks3;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №3: "Вывести четные элементы"

Дан массив, состоящий из целых чисел. Напишите программу, которая выводит те элементы массива, которые являются чётными числами.

> Входные данные: Сначала задано число N — количество элементов в массиве (1N100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
> Выходные данные: Необходимо вывести все четные элементы массива (то есть те элементы, которые являются четными числами).

 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print even numbers
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                System.out.print(String.valueOf(n).concat(" "));
        }
    }
}
