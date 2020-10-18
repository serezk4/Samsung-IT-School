package com.serezka.lesson8.hw.tasks2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
Модуль 1. Основы языка Java
1.8. Дополнительные задания I
Задание №4: "Факториал"

По данному натуральному n вычислите значение n!.

> Входные данные: Вводится единственное число n.
> Выходные данные: Необходимо вывести  значение n!.
 */

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger numF = factorial(new BigInteger(consoleReader.readLine().trim()));
        System.out.println(numF.compareTo(BigInteger.valueOf(0)) <= 0 ? 1 : numF);
    }

    public static BigInteger factorial(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) return num;
        else return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
}
