package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = n;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            result = result * (n - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(calc(1));
    }
}
