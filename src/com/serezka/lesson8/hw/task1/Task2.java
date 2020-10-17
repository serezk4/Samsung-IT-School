package com.serezka.lesson8.hw.task1;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №2

Выведите на экран сумму четных элементов массива.
Если в массиве нет четных элементов, выведите "NO".
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt(), sum = 0, els = 0;
        for (int i = 0; i < l; i++) {
            int s = sc.nextInt();
            if (s % 2 == 0) {
                sum += s;
                els++;
            }
        }
        System.out.println(els == 0 ? "NO" : sum);
    }
}
