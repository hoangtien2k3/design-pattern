package Creational_Pattern.Singleton.crs.EagerInitialization;

public class EagerInitialization1 {
    // Biến instance sẽ lưu trữ một đối tượng của class Singleton.
    private static EagerInitialization1 instance = new EagerInitialization1();

    // private constructor để ngăn chặn việc tạo đối tượng từ bên ngoài class.
    private EagerInitialization1() {}

    // phương thức getInstance để lấy ra đối tượng Singleton đã được khởi tạo sẵn.
    public static EagerInitialization1 getInstance() {
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
