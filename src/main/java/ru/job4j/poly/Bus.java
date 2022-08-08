package ru.job4j.poly;

public class Bus implements Transport {

    private int passengers = 0;
    private int way = 0;

    @Override
    public void ride() {
        way++;
    }

    @Override
    public void passengers(int passengers) {
        this.passengers += passengers;
    }

    @Override
    public double fuel(int price) {
        return price;
    }
}
