package Behavioral.Delegation.java;

// Lớp khác sử dụng Delegation Pattern để chuyển giao hành vi in ấn cho một delegate
class FancyPrinter implements Printer {
    private final Printer printerDelegate;

    public FancyPrinter(Printer printerDelegate) {
        this.printerDelegate = printerDelegate;
    }

    // Chuyển giao hành vi in ấn cho delegate
    @Override
    public void print(String message) {
//        System.out.println("Fancy Printing: " + message);
        // Gọi delegate để thực hiện hành vi in ấn cơ bản
        printerDelegate.print(message);
    }
}