package com.serezka.lesson8.hw.tasks3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №6: "Максимум в массиве"

Вводится массив, состоящий из целых чисел. Найти наибольшее среди них.

> Входные данные: Сначала задано число N — количество элементов в массиве (1N35).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел.
> Выходные данные: Необходимо вывести значение наибольшего элемента в массиве.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // fill arr
        List<Integer> integers = new ArrayList<>();
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) integers.add(sc.nextInt());

        // find max
        System.out.println(Collections.max(integers));
    }
}
