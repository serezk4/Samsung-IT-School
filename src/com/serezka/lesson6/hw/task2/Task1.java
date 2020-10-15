package com.serezka.lesson6.hw.task2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №1

Напишите программу, которая вводит с клавиатуры номер месяца и определяет,сколько дней в этом месяце.
При вводе неверного номера месяца должно быть выведено сообщение об ошибке.
Считается, что год невисокосный.

> Входные данные: Входная строка содержит единственное целое число – номер месяца (возможно, неправильный).
> Выходные данные: Выходная строка должна содержать одно целое число – количество дней в этом месяце или 0, если был введён неверный номер месяца.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Map<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        int input = sc.nextInt();
        System.out.println((input > months.size() || input <= 0) ? 0 : months.get(input));
    }
}
