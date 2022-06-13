package ru.job4j;

import ru.job4j.inheritance.Engineer;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(experience, degree);
        this.programLang = programLang;
    }
}
