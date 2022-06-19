package ru.job4j.poly;

public class VenicleUsage {
    public static void main(String[] args) {
        Venicle bus = new Bus();
        Venicle train = new Train();
        Venicle plain = new Plain();
        Venicle[] venicle = new Venicle[]{bus, train, plain};
        for (Venicle v : venicle) {
            v.move();
        }
    }
}




