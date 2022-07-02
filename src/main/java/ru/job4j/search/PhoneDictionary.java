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
            if (pers.getPhone().equals(key) || pers.getAddress().equals(key) || pers.getName().equals(key) || pers.getSurname().equals(key)) {
                result.add(pers);
            }
        }

        return result;
    }
}
