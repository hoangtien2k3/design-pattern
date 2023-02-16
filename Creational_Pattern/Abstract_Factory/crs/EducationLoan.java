package Creational_Pattern.Abstract_Factory.crs;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double rate) {
        this.rate = rate;
    }
}
