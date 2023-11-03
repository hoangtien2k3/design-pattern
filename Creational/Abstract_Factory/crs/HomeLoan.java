package Creational.Abstract_Factory.crs;

public class HomeLoan extends Loan {
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
