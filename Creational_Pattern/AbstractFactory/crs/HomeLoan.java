package Creational_Pattern.AbstractFactory.crs;

public class HomeLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
