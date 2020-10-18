package com.serezka.lesson6.hw.tasks2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №2

Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года.
При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.

> Входные данные: Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
> Выходные данные: Программа должна вывести количество дней, оставшихся до Нового года. Если введены неверные данные, нужно вывести число -1.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int months = sc.nextInt();
        int days = sc.nextInt();

        System.out.println(((months < 1) || (months > 12) || days > getDaysInMonth(months)) ? "-1" : getDaysRange(months, days));
    }

    // IN DAYS
    private static int getDaysRange(int month, int day) {
        int daysRange = 0;
        for (int i = month; i <= 12; i++)
            for (int j = (i == month ? day : 0); j < getDaysInMonth(i); j++)
                daysRange++;
        return daysRange;
    }

    private static int getDaysInMonth(int monthId) {
        if (monthId < 1 || monthId > 12)
            return -1;

        Map<Integer, Integer> daysInMonth = new HashMap<>();
        daysInMonth.put(1, 31);
        daysInMonth.put(2, 28);
        daysInMonth.put(3, 31);
        daysInMonth.put(4, 30);
        daysInMonth.put(5, 31);
        daysInMonth.put(6, 30);
        daysInMonth.put(7, 31);
        daysInMonth.put(8, 31);
        daysInMonth.put(9, 30);
        daysInMonth.put(10, 31);
        daysInMonth.put(11, 30);
        daysInMonth.put(12, 31);

        return daysInMonth.get(monthId);
    }
}
