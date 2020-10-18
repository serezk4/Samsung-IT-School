package com.serezka.lesson8.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания I
Задание №2

Для настольной игры используются карточки с номерами от 1 до N (N – натуральное число, не превышающее 106). Одна карточка потерялась. Найдите ее.

> Входные данные: Дано N, далее N-1 номеров оставшихся карточек.
> Выходные данные: Требуется вывести номер потерянной карточки.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> cards = new ArrayList<>();
        int count = sc.nextInt();
        for (int i = 0; i < count-1; i++) cards.add(sc.nextInt());

        for (int i = 1; i <= count; i++)
            if (!cards.contains(i)) System.out.println(i);
    }
}
