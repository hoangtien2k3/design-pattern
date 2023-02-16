package Creational_Pattern.Abstract_Factory.crs;

public class HDFC implements Bank{
    private final String BNAME;
    public HDFC() {
        BNAME = "HDFC Bank";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
