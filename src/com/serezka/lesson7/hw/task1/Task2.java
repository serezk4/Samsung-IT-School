package com.serezka.lesson7.hw.task1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №2

С клавиатуры вводятся натуральные числа, пока не будет введено число, делящееся на 5.
Вывести на экран сумму тех введенных чисел, которые больше 10.
Если таких чисел не окажется, вывести 0.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int n;
        do {
            n = sc.nextInt();
            result += n > 10 ? n : 0;
        } while (n % 5 != 0);
        System.out.println(result);
    }
}
