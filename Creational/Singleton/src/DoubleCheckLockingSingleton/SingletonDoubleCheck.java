package Creational.Singleton.src.DoubleCheckLockingSingleton;

public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    void doSomething() {
        System.out.println("Double Check Locking In Singleton!!!");
    }

}
