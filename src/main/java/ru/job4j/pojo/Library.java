package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        books[0].setName("Clean Code");
        books[1].setName("Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("change books places");
        Book temp = new Book();
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("all Clean code books out");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (bk.getName() == "Clean Code") {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }

}
