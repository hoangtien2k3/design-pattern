package Creational_Patterns.FactoryMethod.test;

public class RunDeMo {
    public static void main(String[] args) {
        new PhoneFactory().getPhone(PhoneType.SAMSUNG).showInformation();
    }
}
