package Creational.Abstract_Factory.java.book;

public abstract class Book {
    private String name;

    public abstract String getCategory();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
