package Creational.Singleton.src.Lazy;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton1 singleton1 = LazySingleton1.getInstance();
        LazySingleton1 singleton2 = LazySingleton1.getInstance();
        singleton1.setName("Tiến");
        System.out.println(singleton1.getName());
//        System.out.println(singleton2.getName());


        if (singleton1 == singleton2) {
            System.out.println("singleton1 = singleton2 && singleton1.getName() == singleton2.getName()");
        } else {
            System.out.println("singleton1 != singleton2 && singleton1.getName() != singleton2.getName()");
        }



        System.out.println("////////////////////////////////////////////////////////");



        LazySingleton2 singleton3 = LazySingleton2.getInstance();
        LazySingleton2 singleton4 = LazySingleton2.getInstance();
        singleton3.setName("Hoàng Anh Tiến");
        System.out.println(singleton3.getName());
        System.out.println(singleton4.getName());

        if (singleton3 == singleton4) {
            System.out.println("singleton3 = singleton4 && singleton3.getName() == singleton4.getName()");
        } else {
            System.out.println("singleton3 != singleton4 && singleton3.getName() == singleton4.getName()");
        }
    }
}
