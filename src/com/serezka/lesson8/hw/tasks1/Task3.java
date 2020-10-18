package com.serezka.lesson8.hw.tasks1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №3

Выведите на экран среднее арифметическое элементов массива, имеющих нечетное значение.
Ответ выведите с точностью 2 знака после запятой.
Если в массиве нет нечетных элементов, выведите "NO".
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        List<Integer> integers = new ArrayList<>();
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) integers.add(sc.nextInt());

        double sum = 0;
        int count = 0;
        for (int i : integers) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(sum == 0 ? "NO" : String.format("%.2f", (sum / count)).replace(',', '.'));
    }
}
