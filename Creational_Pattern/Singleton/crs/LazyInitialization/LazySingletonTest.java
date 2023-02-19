package Creational_Pattern.Singleton.crs.LazyInitialization;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton1 singleton1 = LazySingleton1.getInstance();
        LazySingleton1 singleton2 = LazySingleton1.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton1 = singleton2");
        } else {
            System.out.println("singleton1 != singleton2");
        }

        ////////////////////////////////////////////////////////

        LazySingleton2 singleton3 = LazySingleton2.getInstance();
        LazySingleton2 singleton4 = LazySingleton2.getInstance();

        if (singleton3 == singleton4) {
            System.out.println("singleton3 = singleton4");
        } else {
            System.out.println("singleton3 != singleton4");
        }
    }
}
