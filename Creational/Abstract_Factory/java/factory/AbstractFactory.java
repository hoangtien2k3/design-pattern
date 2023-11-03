package Creational.Abstract_Factory.java.factory;

public interface AbstractFactory {
    <T> T newProduct(Class<T> type, String name);
}
