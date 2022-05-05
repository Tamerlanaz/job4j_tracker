package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void catName(String cname) {
        this.name = cname;
    }

    public static void main(String[] args) {
        System.out.println("There are litle cat's name and food.");
        Cat gav = new Cat();
        gav.catName("Гаф");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are big cat's name and food.");
        Cat black = new Cat();
        black.catName("Блэк");
        black.eat("fish");
        black.show();
    }
}
