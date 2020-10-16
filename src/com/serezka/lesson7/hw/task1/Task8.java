package com.serezka.lesson7.hw.task1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №8

С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<109).
Вывести на экран самую младшую нечетную цифру в десятичном представлении числа.
Если в числе нет нечетных цифр, вывести "NO".
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = inverse(sc.nextInt());
        while (num > 0) {
            if (num % 10 % 2 != 0) {
                System.out.println(num % 10);
                return;
            }
            num /= 10;
        }
        System.out.println("NO");
    }

    private static int inverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
