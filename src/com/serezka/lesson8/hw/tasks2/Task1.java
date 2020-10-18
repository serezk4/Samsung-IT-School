package com.serezka.lesson8.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания I
Задание №1

Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.

> Входные данные: Задано единственное число N
> Выходные данные: Необходимо вывести требуемое представление числа N.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(new StringBuffer(Integer.toBinaryString(new Scanner(System.in).nextInt())).reverse().toString());
    }
}
