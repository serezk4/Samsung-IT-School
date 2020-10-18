package com.serezka.lesson8.hw.tasks1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №1

Введите с клавиатуры целое число X.
Выведите на экран номер элемента массива, который равен X.
Если таких элементов несколько, выведите меньший номер.
Выводить на экран номер элемента, который считается от 1.
То есть, начальный элемент массива при выводе на экран считать первым.
Если такого элемента нет, выведите "NO".
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();

        int exp = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == exp) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println("NO");
    }
}
