package ru.job4j.array;

public class EndsWithTest {
    public static boolean endsWith(char[] word, char[] post) {
        for (int index = 0; index < post.length; index++) {
            return word[word.length - 1 - index] == post[post.length - 1 - index];
        }
        return false;
    }
}
