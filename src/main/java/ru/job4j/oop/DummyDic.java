package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic paul = new DummyDic();
        String say = paul.engToRus("all");
        System.out.println(say);
    }
}
