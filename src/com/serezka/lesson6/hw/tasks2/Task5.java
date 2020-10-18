package com.serezka.lesson6.hw.tasks2;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №5

Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания.
Программа должна считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.

> Входные данные: Вводятся три числа, каждое записано в отдельной строке.
> Выходные данные: Выведите ответ на задачу.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            int buff = a;
            a = b;
            b = buff;
        }

        if (b > c) {
            int buff = b;
            b = c;
            c = buff;
        }

        if (a > b) {
            int buff = a;
            a = b;
            b = buff;
        }

        System.out.printf("%d %d %d", a, b, c);
    }
}
