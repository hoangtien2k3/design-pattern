package Creational_Pattern.AbstractFactory.crs;

public class BussinessLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
