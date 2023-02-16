package Creational_Patterns.FactoryMethod.test;

public class PhoneFactory {
    public Phone getPhone(PhoneType phoneType) {
        switch(phoneType) {
            case SAMSUNG:
                return new SamsungPhone();
            case APPLE:
                return new ApplePhone();
            case NOKIA:
                return new NokiaPhone();
        }
        return null;
    }
}
