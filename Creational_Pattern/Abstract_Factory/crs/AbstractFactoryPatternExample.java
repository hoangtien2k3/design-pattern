package Creational_Pattern.Abstract_Factory.crs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nhap ten cua Bank ma ban muon vay tien: ");
        String bankName = br.readLine();

        System.out.print("Nhap kieu ban muon vay (home, business, education): ");
        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.print("Nhap lai suat ngan hang " + b.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Nhap so tien ban muon vay: ");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.print("Nhap so nam de thanh toan toan bo so tien ban vay: ");
        int years = Integer.parseInt(br.readLine());

        System.out.println("Ban dang vay tien tu " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount, years);
    }
}
