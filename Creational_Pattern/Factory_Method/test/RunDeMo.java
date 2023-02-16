package Creational_Pattern.Factory_Method.test;

public class RunDeMo {
    public static void main(String[] args) {
        new PhoneFactory().getPhone(PhoneType.SAMSUNG).showInformation();
    }
}
