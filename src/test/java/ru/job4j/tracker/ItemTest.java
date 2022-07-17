package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;

public class ItemTest {

    @Test
    public void whenAscSort() {
        Item ivan = new Item("Ivan");
        Item petr = new Item("Petr");
        Item ekaterina = new Item("Ekaterina");
        List<Item> items = new ArrayList<>();
        items.add(ivan);
        items.add(petr);
        items.add(ekaterina);
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = List.of(ekaterina, ivan, petr);
        assertThat(items, is(expected));
}

    @Test
    public void whenDescSort() {
        Item ivan = new Item("Ivan");
        Item petr = new Item("Petr");
        Item ekaterina = new Item("Ekaterina");
        List<Item> items = new ArrayList<>();
        items.add(ivan);
        items.add(petr);
        items.add(ekaterina);
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = List.of(petr, ivan, ekaterina);
        assertThat(items, is(expected));
    }
}

