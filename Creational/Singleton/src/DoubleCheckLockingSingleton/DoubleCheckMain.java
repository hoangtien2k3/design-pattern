package Creational.Singleton.src.DoubleCheckLockingSingleton;

public class DoubleCheckMain {
    public static void main(String[] args) {

        System.out.println("Start");

        SingletonDoubleCheck singletonDoubleCheck1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck singletonDoubleCheck2 = SingletonDoubleCheck.getInstance();
        singletonDoubleCheck1.doSomething();
        singletonDoubleCheck2.doSomething();

        System.out.println(singletonDoubleCheck1 == singletonDoubleCheck2);


        final Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(SingletonDoubleCheck::getInstance);
        }
        for (Thread thread : threads) {
            thread.start();
        }

        System.out.println("End");
    }
}
