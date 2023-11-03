package Creational.Singleton.src.Lazy;

public class LazySingleton {
    public static void main(String[] args) {
        Lazy1 singleton1 = Lazy1.getInstance();
        Lazy1 singleton2 = Lazy1.getInstance();
        singleton1.setName("Tiến");
        System.out.println(singleton1.getName());
//        System.out.println(singleton2.getName()); // lỗi


        if (singleton1 == singleton2) {
            System.out.println("singleton1 = singleton2 && singleton1.getName() == singleton2.getName()");
        } else {
            System.out.println("singleton1 != singleton2 && singleton1.getName() != singleton2.getName()");
        }



        System.out.println("////////////////////////////////////////////////////////");


        Lazy2 singleton3 = Lazy2.getInstance();
        Lazy2 singleton4 = Lazy2.getInstance();
        singleton3.setName("Hoàng Anh Tiến");
        System.out.println(singleton3.getName());
        System.out.println(singleton4.getName());

        if (singleton3 == singleton4) {
            System.out.println("singleton3 = singleton4 && singleton3.getName() == singleton4.getName()");
        } else {
            System.out.println("singleton3 != singleton4 && singleton3.getName() == singleton4.getName()");
        }



        System.out.println("////////////////////////////////////////////////////////");


        Lazy3 singleton5 = Lazy3.getInstance();
        Lazy3 singleton6 = Lazy3.getInstance();
        singleton5.setName("hoangtien2k3");
        System.out.println(singleton5.getName());
        System.out.println(singleton6.getName());

        if (singleton5 == singleton6) {
            System.out.println("singleton5 = singleton6 && singleton5.getName() == singleton6.getName()");
        } else {
            System.out.println("singleton5 != singleton6 && singleton5.getName() == singleton6.getName()");
        }




    }
}
