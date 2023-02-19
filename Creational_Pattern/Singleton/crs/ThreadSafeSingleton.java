package Creational_Pattern.Singleton.crs;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}


    /*
    *   từ khóa synchronized được sử dụng để đồng bộ hóa các luồng (thread synchronization).
    *   Khi một phương thức hoặc một khối mã được đánh dấu là synchronized, nghĩa là chỉ có một
    *   luồng có thể thực thi phương thức hoặc khối mã này cùng một thời điểm.
    * */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from ThreadSafeSingleton!");
    }
}
