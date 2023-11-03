package Creational.Singleton.src.Eager;

public class Eager {
    private static final Eager instance = new Eager();

    private Eager() {}

    public static Eager getInstance() {
        return instance;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
