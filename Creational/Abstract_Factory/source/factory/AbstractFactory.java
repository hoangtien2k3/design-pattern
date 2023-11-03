package Creational.Abstract_Factory.source.factory;

public interface AbstractFactory {
    <T> T newProduct(Class<T> type, String name);
}
