package com.serezka.lesson7.hw.task1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №1

С клавиатуры вводятся целые числа, пока не будет введено отрицательное число.
Вывести на экран количество введенных чисел.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;
        while (sc.nextInt() >= 0)
            result++;
        System.out.println(result);
    }
}
