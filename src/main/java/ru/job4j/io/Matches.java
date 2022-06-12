package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            while (matches > count || matches > 3 || matches < 1) {
                System.out.println(player + " Введено неверное число. Введите число от 1 до 3, не превышающее количество оставшихся спичек на столе.");
                matches = Integer.parseInt(input.nextLine());
            }
            turn = !turn;
            count = count - matches;
            System.out.println("На столе осталось " + count + " спичек.2");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
