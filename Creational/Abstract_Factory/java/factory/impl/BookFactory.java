package Creational.Abstract_Factory.java.factory.impl;

import Creational.Abstract_Factory.java.book.TechnologyBook;
import Creational.Abstract_Factory.java.book.Book;
import Creational.Abstract_Factory.java.book.HistoryBook;
import Creational.Abstract_Factory.java.factory.AbstractFactory;

public class BookFactory implements AbstractFactory {
    @Override
    public <T> T newProduct(Class<T> type, String name) {
        final Book book = type.equals(HistoryBook.class)
                ? new HistoryBook()
                : new TechnologyBook();

        book.setName(name);
        return (T) book;
    }
}
