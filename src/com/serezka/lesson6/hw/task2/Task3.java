package com.serezka.lesson6.hw.task2;

import java.util.*;

/*
Модуль 1. Основы языка Java
1.6. Дополнительные задания
Задание №3

Дано число X. Требуется перевести это число в римскую систему счисления.

> Входные данные: Дано число X в десятичной системе счисления (1  ≤  X  ≤  100).
> Выходные данные: Выведите X в римской системе счисления.
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int num = sc.nextInt();
        System.out.println(num < 0 || num > 100 ? "Error! 0<{number}<=100 range only!" : numToRoman(num));
    }

    private static String numToRoman(int n) {
        if (n <= 0)
            return "Unexpected number!";

        StringBuilder result = new StringBuilder();

        Map<Integer, String> romanNums = new HashMap<>();
        romanNums.put(1, "I");
        romanNums.put(4, "IV");
        romanNums.put(5, "V");
        romanNums.put(9, "IX");
        romanNums.put(10, "X");
        romanNums.put(40, "XL");
        romanNums.put(50, "L");
        romanNums.put(90, "XC");
        romanNums.put(100, "C");

        while (n > 0) {
            int biggestKey = romanNums.keySet().iterator().next();
            for (int currentKey : romanNums.keySet())
                if (n >= currentKey && biggestKey < currentKey)
                    biggestKey = currentKey;

            n -= biggestKey;
            result.append(romanNums.get(biggestKey));
        }

        return result.toString();
    }
}
