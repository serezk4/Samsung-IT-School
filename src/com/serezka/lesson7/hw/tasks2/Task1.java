package com.serezka.lesson7.hw.tasks2;

/*
Модуль 1. Основы языка Java
1.7. Дополнительные задания
Задание №1: "Автобусная экскурсия"

Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады.
Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются) высотой 437 сантиметров.
На экскурсионном маршруте встречаются N мостов. Жюри и оргкомитет олимпиады очень обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них.
Им удалось выяснить точную высоту каждого из мостов. Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса.
Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.

> Входные данные: Во входном файле сначала содержится число N (1N1000).
Далее идут N натуральных чисел, не превосходящих 10000 - высоты мостов в сантиметрах в том порядке, в котором они встречаются на пути автобуса.
> Выходные данные: В единственную строку выходного файла нужно вывести фразу "No crash", если экскурсия закончится благополучно.
Если же произойдет авария, то нужно вывести сообщение "Crash k", где k - номер моста, где произойдет авария. Фразы выводить без кавычек ровно с одним пробелом внутри.

✅ 1,00/1,00
 */

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int busHeight = 437;
        int[] bridges = new int[sc.nextInt()];
        for (int i = 0; i < bridges.length; i++) bridges[i] = sc.nextInt();
        for (int i = 0; i < bridges.length; i++) {
            if (busHeight >= bridges[i]) {
                System.out.printf("Crash %d", i + 1);
                return;
            }
        }

        System.out.println("No crash");
    }
}