package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemAscByName() {
        Item ivan = new Item("Ivan");
        Item petr = new Item("Petr");
        Item ekaterina = new Item("Ekaterina");
        List<Item> items = new ArrayList<>();
        items.add(ivan);
        items.add(petr);
        items.add(ekaterina);
        List<Item> expected = List.of(ekaterina, ivan, petr);
        Collections.sort(items, new ItemAscByName());
        assertThat(items, is(expected));
    }

    @Test
    public void itemDescByName() {
        Item ivan = new Item("Ivan");
        Item petr = new Item("Petr");
        Item ekaterina = new Item("Ekaterina");
        List<Item> items = new ArrayList<>();
        items.add(ivan);
        items.add(petr);
        items.add(ekaterina);
        List<Item> expected = List.of(petr, ivan, ekaterina);
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }
}