package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] copy = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item el = items[i];
            if (el != null) {
                copy[size] = el;
                size++;
            }
        } return Arrays.copyOf(copy, size);
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                copy[i] = items[index];
                i++;
            }
        } return Arrays.copyOf(copy, i);
    }
}