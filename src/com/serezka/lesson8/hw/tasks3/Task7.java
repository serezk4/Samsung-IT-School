package com.serezka.lesson8.hw.tasks3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №7: "Количество различных элементов в монотонном массиве"

Дан массив, состоящий из целых чисел. Известно, что числа упорядочены по неубыванию (то есть каждый следующий элемент не меньше предыдущего).
Напишите программу, которая определит количество различных чисел в этом массиве.

> Входные данные: Сначала задано число N — количество элементов в массиве (1N100).
Далее через пробел записаны N чисел — элементы массива. Массив состоит из целых чисел, находящихся в пределах от −231 до 231−1
> Выходные данные: Необходимо вывести единственное число - количество различных чисел в массиве.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // fill set
        Set<Integer> integers = new HashSet<>();
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) integers.add(sc.nextInt());

        // print diff elements (set size)
        System.out.println(integers.size());
    }
}
