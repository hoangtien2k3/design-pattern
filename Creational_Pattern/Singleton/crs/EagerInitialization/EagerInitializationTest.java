package Creational_Pattern.Singleton.crs.EagerInitialization;

public class EagerInitializationTest {
    public static void main(String[] args) {
        EagerInitialization1 eager1 = EagerInitialization1.getInstance();
        eager1.setName("Tiến");
        System.out.println(eager1.getName());

        EagerInitialization1 eager2 = EagerInitialization1.getInstance();
        System.out.println(eager2.getName());

        if (eager1 == eager2) {
            System.out.println("eager1 = eager2 && eager1.getName() == eager2.getName()");
        } else {
            System.out.println("eager1 != eager2 && eager1.getName() != eager2.getName()");
        }
    }
}
