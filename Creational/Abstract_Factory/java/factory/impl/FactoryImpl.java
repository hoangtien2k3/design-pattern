package Creational.Abstract_Factory.java.factory.impl;

import Creational.Abstract_Factory.java.book.Book;
import Creational.Abstract_Factory.java.factory.AbstractFactory;

public class FactoryImpl implements AbstractFactory {

    private final AuthorFactory authorFactory = new AuthorFactory();
    private final BookFactory bookFactory = new BookFactory();

    @Override
    public <T> T newProduct(Class<T> type, String name) {
        return Book.class.isAssignableFrom(type)
                ? bookFactory.newProduct(type, name)
                : authorFactory.newProduct(type, name);
    }
}
