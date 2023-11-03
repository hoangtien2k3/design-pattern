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

//public class DclSingleton {
//    private static volatile DclSingleton instance;
//    public static DclSingleton getInstance() {
//        if (instance == null) {
//            synchronized (DclSingleton .class) {
//                if (instance == null) {
//                    instance = new DclSingleton();
//                }
//            }
//        }
//        return instance;
//    }
//
//    // private constructor and other methods...
//}