package Creational_Pattern.Singleton.Eager;

public class EagerTest {
    public static void main(String[] args) {
        Eager eager1 = Eager.getInstance();
        eager1.setName("Tiến");
        System.out.println(eager1.getName());

        Eager eager2 = Eager.getInstance();
        System.out.println(eager2.getName());

        if (eager1 == eager2) {
            System.out.println("eager1 = eager2 && eager1.getName() == eager2.getName()");
        } else {
            System.out.println("eager1 != eager2 && eager1.getName() != eager2.getName()");
        }
    }
}
