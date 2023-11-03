package Creational.Singleton.src.Lazy;

public class Lazy1 {
    private static Lazy1 instance;
    private Lazy1() {
    }

    /*
    *   LazySingleton chỉ xảy ra khi phương thức getInstance() được gọi lần đầu tiên và biến instance là null.
    *   Tuy nhiên, khi biến instance không phải null, phương thức getInstance() sẽ gán giá trị null cho biến instance
    *   trả về đối tượng mới.
    *   Do đó, singleton1 != singleton2, nếu chúng được tạo ra từ hai lần gọi phương thức getInstance() khác nhau
    * */
    public static Lazy1 getInstance() {
        if (instance == null) {
            instance = new Lazy1();
        } else {
            instance = null;
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
