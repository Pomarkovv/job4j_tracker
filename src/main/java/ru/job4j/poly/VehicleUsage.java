package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle plain = new Plain();
        Vehicle[] vehicle = new Vehicle[]{bus, train, plain};
        for (Vehicle v : vehicle) {
            v.move();
        }
    }
}