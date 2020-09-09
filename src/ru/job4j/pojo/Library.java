package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book chernovik = new Book("Chernovik", 9);
        Book java = new Book("Java", 11);
        Book spectr = new Book("Spectr", 3);
        Book cleanCode = new Book("Clean code", 15);

        Book[] books = new Book[4];
        books[0] = chernovik;
        books[1] = java;
        books[2] = spectr;
        books[3] = cleanCode;

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }

        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if ("Clean code".equals(books[i].getName())) {
                System.out.println(books[i].getName() + " " + books[i].getCount());
            }
        }
    }
}
