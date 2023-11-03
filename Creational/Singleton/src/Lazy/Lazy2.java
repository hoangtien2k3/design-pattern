package Creational.Singleton.src.Lazy;

public class Lazy2 {
    private static Lazy2 instance;
    private Lazy2(){}

    /*
    *   Để hai instance3 và instance4 khi khai báo bằng nhau thì có thể dùng theo cách bên dưới.
    *   phương thức getInstance() nên chỉ trả về instance hiện có khi nó đã được khởi tạo, không
    *   nên tạo một instance mới và gán giá trị null cho biến instance.
    *
    * */
    public static Lazy2 getInstance() {
        if (instance == null) {
            instance = new Lazy2();
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
