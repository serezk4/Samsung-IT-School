package com.serezka.lesson8.hw.tasks3;

import java.util.*;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания II
Задание №1: "Двойной переворот"

Дана последовательность натуральных чисел 1, 2, 3, ..., N (1 ≤ N ≤ 1000).
Необходимо сначала расположить в обратном порядке часть этой последовательности от элемента с номером A до элемента с номером B, а затем от C до D (A < B; C < D; 1 ≤ A, B, C, D ≤ N).

> Входные данные: Вводятся натуральные числа числа N, A, B, C, D.
> Выходные данные: Требуется вывести полученную последовательность.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get arguments
        int n = sc.nextInt();
        int a = sc.nextInt() - 1;
        int b = sc.nextInt();
        int c = sc.nextInt() - 1;
        int d = sc.nextInt();

        // fill main integers
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            integers.add(i + 1);

        // reverse parts
        reversePart(integers, a, b);
        reversePart(integers, c, d);

        // print result
        integers.forEach(el -> System.out.print(String.valueOf(el).concat(" ")));
    }

    private static <E> void reversePart(List<E> list, int fromIndex, int toIndex) {
        List<E> sub = list.subList(fromIndex, toIndex);
        Collections.reverse(sub);
        for (int i = fromIndex; i < toIndex; i++) list.set(i, sub.get(i - fromIndex));
    }
}
