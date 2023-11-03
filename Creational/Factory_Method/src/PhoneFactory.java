package Creational.Factory_Method.src;

public class PhoneFactory {
    public Phone getPhone(PhoneType phoneType) {
        return switch (phoneType) {
            case SAMSUNG -> new SamsungPhone();
            case APPLE -> new ApplePhone();
            case NOKIA -> new NokiaPhone();
        };
    }
}
