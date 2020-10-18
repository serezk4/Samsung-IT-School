package com.serezka.lesson8.hw.tasks1;

/*
Модуль 1. Основы языка Java
1.8. Задания
Задание №5

Развернуть массив в обратную сторону ("задом наперед").
Последний элемент должен находится на месте начального и наоборот.
Не разрешается использовать дополнительный массив.
Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
 */

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integers = new ArrayList<>();
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) integers.add(sc.nextInt());

        Collections.reverse(integers);
        integers.forEach(n -> System.out.print(n + " "));
    }
}
