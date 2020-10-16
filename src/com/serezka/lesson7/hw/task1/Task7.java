package com.serezka.lesson7.hw.task1;

import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №7

Ввести с клавиатуры натуральное число N (N<109).
Вывести на экран количество десятичных цифр в числе.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().length());
    }
}
