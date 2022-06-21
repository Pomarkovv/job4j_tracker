package ru.job4j.poly;

public class Bus2 implements Transport{
    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void passengers(int pass) {
        System.out.println(pass);
    }

    @Override
    public double fuel(double volume) {
        return 50 * volume;
    }
}
