package com.serezka.lesson6.hw.tasks2;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №6

Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.

> Входные данные: Даны три натуральных числа – стороны треугольника.
> Выходные данные: Необходимо вывести одно из слов:
    - right для прямоугольного треугольника,
    - acute для остроугольного треугольника,
    - obtuse для тупоугольного треугольника
    - impossible, если входные числа не образуют треугольника.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b >= c && a + c >= b && b + c >= a) {
            double powAB = Math.pow(a, 2) + Math.pow(b, 2);
            double powC = Math.pow(c, 2);

            if (powC == powAB)
                System.out.println("right");
            else if (powC > powAB)
                System.out.println("acute");
            else
                System.out.println("obtuse");
        } else {
            System.out.println("impossible");
        }
    }
}
