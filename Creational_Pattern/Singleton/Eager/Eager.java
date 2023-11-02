package Creational_Pattern.Singleton.Eager;

public class Eager {
    // Biến instance sẽ lưu trữ một đối tượng của class Singleton.
    private static Eager instance = new Eager();

    // private constructor để ngăn chặn việc tạo đối tượng từ bên ngoài class.
    private Eager() {}

    // phương thức getInstance để lấy ra đối tượng Singleton đã được khởi tạo sẵn.
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
