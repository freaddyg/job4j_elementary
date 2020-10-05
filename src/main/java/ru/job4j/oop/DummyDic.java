package ru.job4j.oop;

public class DummyDic {
    public static String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        String str = engToRus("Hi");
        System.out.println(str);
    }
}