package com.serezka.lesson7.hw.task1;

import java.util.Locale;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.7. Задания
Задание №5

С клавиатуры вводится натуральное число. Вывести на экран количество цифр в двоичном представлении числа.
Подсказка: нужно делить число на 2 и считать остатки.

> Пояснение с примеру: Число 35 в двоичном виде записывается как 100011. Это 6 разрядов.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println(Integer.toBinaryString(sc.nextInt()).length());
    }
}
