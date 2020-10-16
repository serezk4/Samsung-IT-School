package com.serezka.lesson6.hw.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №4

> Входные данные: Даны три целых числа, каждое записано в отдельной строке.
> Выходные данные: Выведите наибольшее из данных чисел (программа должна вывести ровно одно целое число).
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);
    }
}
