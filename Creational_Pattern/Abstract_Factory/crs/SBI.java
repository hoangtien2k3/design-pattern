package Creational_Pattern.Abstract_Factory.crs;

public class SBI implements Bank{
    private final String BNAME;

    public SBI() {
        BNAME = "SBI BANK";
    }

    public String getBankName() {
        return BNAME;
    }
}
