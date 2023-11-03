package Creational.Factory_Method.src;

public class RunDeMo {
    public static void main(String[] args) {

        Phone phone = new PhoneFactory().getPhone(PhoneType.SAMSUNG);
        phone.showInformation();

        new PhoneFactory().getPhone(PhoneType.NOKIA).showInformation();
    }
}
