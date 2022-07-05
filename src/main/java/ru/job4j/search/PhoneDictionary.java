package ru.job4j.search;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person pers : persons) {
            if (pers.getPhone().contains(key) ||
                    pers.getAddress().contains(key) ||
                    pers.getName().contains(key) ||
                    pers.getSurname().contains(key)) {
                result.add(pers);
            }
        }

        return result;
    }
}
