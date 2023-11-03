package Creational.Abstract_Factory.source.factory.impl;

import Creational.Abstract_Factory.source.book.Book;
import Creational.Abstract_Factory.source.factory.AbstractFactory;
import Creational.Abstract_Factory.source.factory.impl.AuthorFactory;
import Creational.Abstract_Factory.source.factory.impl.BookFactory;

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
