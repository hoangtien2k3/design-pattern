package Creational_Pattern.Singleton.crs.LazyInitialization;

public class LazySingleton2 {
    private static LazySingleton2 instance;
    private LazySingleton2(){
    }

    /*
    *   Để hai instance3 và instance4 khi khai báo bằng nhau thì có thể dùng theo cách bên dưới.
    *   phương thức getInstance() nên chỉ trả về instance hiện có khi nó đã được khởi tạo, không
    *   nên tạo một instance mới và gán giá trị null cho biến instance.
    *
    * */
    public static LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
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
