package Behavioral.Delegation.java;

public class DelegationExample {
    public static void main(String[] args) {
        // Tạo một đối tượng BasicPrinter
        Printer basicPrinter = new BasicPrinter();

        // Tạo một đối tượng FancyPrinter chuyển giao hành vi in ấn cho BasicPrinter
        Printer fancyPrinter = new FancyPrinter(basicPrinter);

        // Sử dụng FancyPrinter với hành vi in ấn của BasicPrinter
        fancyPrinter.print("Hello, Delegation Pattern!");
    }
}