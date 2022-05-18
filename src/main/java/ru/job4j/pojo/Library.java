package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("JAVA", 1000);
        Book ccode = new Book("Clean code", 100);
        Book python = new Book("Python", 150);
        Book delfi = new Book("Delfi", 200);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = ccode;
        books[2] = python;
        books[3] = delfi;
        System.out.println("Выводим список книг:");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName());
        }
        System.out.println("Переставляем книги с индексами 0 и 3 и выводим список книг:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName());
        }
        System.out.println("Выводим книги с названием \"Clean code\":");
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.equals(books[1])) {
                System.out.println(bk.getName());
            }
        }
    }
}
