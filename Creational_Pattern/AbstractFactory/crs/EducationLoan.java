package Creational_Pattern.AbstractFactory.crs;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
