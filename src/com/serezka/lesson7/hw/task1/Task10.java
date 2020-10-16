package com.serezka.lesson7.hw.task1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №10

Ввести с клавиатуры натуральное число N (N<1000). Вывести на экран наименьшее простое число, которое больше чем N.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (true) {
            num++;
            if (checkSimple(num)) {
                System.out.println(num);
                break;
            }
        }
    }

    private static boolean checkSimple(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
