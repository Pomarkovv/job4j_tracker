package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker implements Store {
    private List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item name) {
        boolean isReplaced = false;
        int index = this.indexOf(id);
        if (index != -1) {
            name.setId(id);
            items.set(index, name);
            isReplaced = true;
        }
        return isReplaced;
    }

    public boolean delete(int id) {
        boolean isDeleted = false;
        int index = this.indexOf(id);
        if (index != -1) {
            items.remove(index);
            isDeleted = true;
        }
        return isDeleted;
    }
}