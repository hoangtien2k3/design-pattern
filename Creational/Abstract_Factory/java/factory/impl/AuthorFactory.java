package Creational.Abstract_Factory.java.factory.impl;

import Creational.Abstract_Factory.java.author.TechnologyAuthor;
import Creational.Abstract_Factory.java.author.Author;
import Creational.Abstract_Factory.java.author.HistoryAuthor;
import Creational.Abstract_Factory.java.factory.AbstractFactory;

public class AuthorFactory implements AbstractFactory {
    @Override
    public <T> T newProduct(Class<T> type, String name) {
        final Author author = type.equals(HistoryAuthor.class)
                ? new HistoryAuthor()
                : new TechnologyAuthor();

        author.setName(name);
        return (T) author;
    }
}
