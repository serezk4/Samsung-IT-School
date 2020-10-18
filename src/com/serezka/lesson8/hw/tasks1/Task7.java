package com.serezka.lesson8.hw.tasks1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №7

Переместить в начало массива все отрицательные значения массива, не меняя их относительного положения.
То есть, каждый отрицательный элемент должен оказаться в том же порядке относительно всех отрицательных элементов,
 а каждый неотрицательный элемент -- в том же порядке относительно всех неотрицательных элементов.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[sc.nextInt()];
        for (int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt();

        for (int i : nums)
            if (i <= 0)
                System.out.print(i + " ");

        for (int i : nums)
            if (i > 0)
                System.out.print(i + " ");
    }
}
