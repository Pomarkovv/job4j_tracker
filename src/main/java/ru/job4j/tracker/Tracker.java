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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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
        }
        return Arrays.copyOf(copy, size);
    }

    public Item[] findByName(String key) {
        Item[] copy = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            if (key.equals(items[index].getName())) {
                copy[i] = items[index];
                i++;
            }
        }
        return Arrays.copyOf(copy, i);
    }

    public boolean replace(int id, Item item) {
        boolean isReplaced = false;
        Item el = this.findById(id);
        if (el != null) {
            el.setName(item.getName());
            isReplaced = true;
        }
        return isReplaced;
    }

    public boolean delete(int id) {
        boolean isDeleted = false;
        Item el = this.findById(id);
        int index = this.indexOf(id);
        if (el != null) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            isDeleted = true;
        }
        return isDeleted;
    }
}