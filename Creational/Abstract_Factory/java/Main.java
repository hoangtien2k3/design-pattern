package Creational.Abstract_Factory.java;

import Creational.Abstract_Factory.java.author.Author;
import Creational.Abstract_Factory.java.author.TechnologyAuthor;
import Creational.Abstract_Factory.java.book.Book;
import Creational.Abstract_Factory.java.book.TechnologyBook;
import Creational.Abstract_Factory.java.factory.AbstractFactory;
import Creational.Abstract_Factory.java.factory.impl.FactoryImpl;

public class Main {
    public static void main(String[] args) {

        final AbstractFactory factory = new FactoryImpl();
        final Book book = factory.newProduct(TechnologyBook.class, "Book");
        final Author author = factory.newProduct(TechnologyAuthor.class, "hoangtien2k3");

        System.out.println("Book: " + book.getName() + " -> " + book.getCategory());

        System.out.println("Author: " + author.getName() + " -> " + author.getMainCategory());

    }
}
