package Behavioral.Delegation.java;

// Lớp thực hiện interface Printer
class BasicPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Basic Printing: " + message);
    }
}
