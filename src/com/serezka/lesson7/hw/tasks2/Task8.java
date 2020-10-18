package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №8: "Быстрое возведение в степень"

Возводить в степень можно гораздо быстрее, чем за n умножений! Для этого нужно воспользоваться следующими рекуррентными соотношениями:
при четном n:  an = (an/2)2
при нечетном: an = a·an-1
Реализуйте алгоритм быстрого возведения в степень. Если вы все сделаете правильно, то сложность вашего алгоритма будет O(logn) .

> Входные данные: Вводится вещественное число a и натуральное n < 1018.
> Выходные данные: Выведите ответ на задачу.

✅ 1,00/1,00
 */

import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println(String.format("%.5f", fastPow(sc.nextDouble(), sc.nextDouble())).replace(',', '.'));
    }

    private static double fastPow(double a, double pow) {
        if (a % 2 == 0) return Math.pow(Math.pow(a, pow / 2), 2);
        else return (a * Math.pow(a, pow - 1));
    }
}
