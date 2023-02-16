package Creational_Patterns.FactoryMethod.crs;

public class CommercialPlan extends Plan {
    @Override
    public void getRate() {
        rate = 5.50;
    }
}
