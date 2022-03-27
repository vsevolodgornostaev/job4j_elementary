package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int tempIs5 = array[0];
        int tempIs2 = array[2];
        array[0] = array[3];
        array[2] = array[1];
        array[3] = array[4];
        array[4] = tempIs5;
        array[1] = tempIs2;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
