package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(first,
                max(second, third)
        );
    }

    public static int max(int first, int second, int third, int four) {
        return max(first,
                max(second,
                        max(third, four)
                )
        );
    }

    public static void main(String[] args) {
        int msg = Max.max(5, 2, 3, 4);
        System.out.println(msg);
    }
}
