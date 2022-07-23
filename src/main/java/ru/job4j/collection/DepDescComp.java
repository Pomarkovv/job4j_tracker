package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] elo1 = o1.split("/");
        String[] elo2 = o2.split("/");
        int result = elo2[0].compareTo(elo1[0]);
        return result != 0 ? result : o1.compareTo(o2);
    }
}