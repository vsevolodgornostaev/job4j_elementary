package ru.job4j.condition;

public class Triangle {

    public static boolean exists(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        System.out.println(exists(2, 2, 2));
    }
}
