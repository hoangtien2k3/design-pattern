package Creational_Pattern.Singleton.crs;

public class ThreadSafeSingletonTest {
    public static void main(String[] args) {
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        singleton.showMessage();
    }
}
