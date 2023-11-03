package Creational.Singleton.src.DoubleCheckLockingSingleton;

public class DoubleCheckMain {
    public static void main(String[] args) {

        System.out.println("Start");

        SingletonDoubleCheck singletonDoubleCheck1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck2 = SingletonDoubleCheck.getInstance();
        singletonDoubleCheck1.doSomething();
        singletonDoubleCheck2.doSomething();

        System.out.println(singletonDoubleCheck1 == singletonDoubleCheck2);


        System.out.println("End");
    }
}
