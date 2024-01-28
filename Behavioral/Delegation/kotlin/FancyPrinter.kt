package Behavioral.Delegation.kotlin

class FancyPrinter(printerDelegate: Printer) : Printer by printerDelegate {
    // Các hành vi khác có thể được thêm vào nếu cần
    fun fancyPrint(message: String) {
        println("Fancy Printing: $message")
    }
}