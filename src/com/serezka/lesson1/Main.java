package com.serezka.lesson1;

import javax.script.ScriptEngineManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // calculator
        System.out.println("Calculator");
        try {
            System.out.printf("Результат: %s.%n", new ScriptEngineManager().getEngineByName("JavaScript").eval(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        } catch (Exception e) {
            System.err.printf("Произошла ошибка! %n%s", e.getMessage());
        }
        System.out.println();

    }
}
