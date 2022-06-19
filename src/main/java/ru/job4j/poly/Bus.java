package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
         System.out.println("drive");
         return "Drive";
    }

    @Override
    public int passengers(int pass) {
        return 30;
    }

    @Override
    public double fuel(double price) {
        int k = 10;
        return 12.3;
    }
}
