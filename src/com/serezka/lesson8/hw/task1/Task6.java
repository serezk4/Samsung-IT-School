package com.serezka.lesson8.hw.task1;

import java.util.*;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №6

Вывести на экран значение самого часто повторяющегося элемента массива.
Если в массиве несколько таких элементов, вывести из них тот, который имеет самый меньший номер.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();
        int l = sc.nextInt();
        for (int i = 0; i < l; i++)
            integers.add(sc.nextInt());

        int index = 0;
        int num = integers.get(index);
        int maxfreq = Collections.frequency(integers, num);
        for (int i = 0; i < integers.size(); i++) {
            if (index < i && maxfreq < Collections.frequency(integers, integers.get(i))) {
                index = i;
                num = integers.get(i);
                maxfreq = Collections.frequency(integers, integers.get(i));
            }
        }

        System.out.println(num);
    }
}
