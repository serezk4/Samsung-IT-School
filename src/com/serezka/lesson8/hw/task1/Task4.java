package com.serezka.lesson8.hw.task1;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №4

В этой задаче не нужно вводить с клавиатуры значения элементов массива.
Нужно заполнить значения элементов массива числами последовательности:
4, 7, 10, 13, 16, ,,,
и вывести получившийся массив на экран.
Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран, не попадая в массив.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int last = 4;
        while (len > 0) {
            System.out.print(last + " ");
            len--;
            last += 3;
        }
    }
}
