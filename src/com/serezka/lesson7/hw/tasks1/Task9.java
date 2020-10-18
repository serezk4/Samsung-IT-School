package com.serezka.lesson7.hw.tasks1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №9

С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<109).
Вывести на экран самую маленькую положительную цифру в десятичном представлении числа.
 */

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int min = num % 10;
        while (num > 0) {
            int l = num % 10;
            num /= 10;

            if (l > 0) {
                if (min > 0) {
                    min = Math.min(min, l);
                } else {
                    min = l;
                }
            }
        }
        System.out.println(min);
    }
}
