package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока, бот.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока, бот.");
        System.out.println(rsl);
    }
}
