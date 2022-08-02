package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> byName = (i) -> i.getName().contains(key);
        Predicate<Person> bySurname = (i) -> i.getSurname().contains(key);
        Predicate<Person> byPhone = (i) -> i.getPhone().contains(key);
        Predicate<Person> byAddress = (i) -> i.getAddress().contains(key);
        Predicate<Person> combine = byName.or(bySurname).or(byPhone).or(byAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
