package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.setName("Pomarkov Ivan Evgenyevich");
        newStudent.setGroup("Group №1");
        newStudent.setDate(new Date());
        System.out.println(newStudent.getName() + " is a new student in" + newStudent.getGroup() + " " + newStudent.getDate());
    }
}
