package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);
    }

    public static double sumAllMatchFunction(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + minus(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumMinusAndDivision равен: " + sumMinusAndDivision(10, 20));
        System.out.println("Результат расчета sumAllMatchFunction равен: " + sumAllMatchFunction(10, 20));
    }
}
