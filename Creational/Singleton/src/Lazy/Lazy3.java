package Creational.Singleton.src.Lazy;

public class Lazy3 {

    private static Lazy3 instance;
    private Lazy3(){}

    public static Lazy3 getInstance() {
        if (instance == null) {
            synchronized (Lazy3.class) {
                if (instance == null) {
                    instance = new Lazy3();
                }
            }
        }
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
