package Behavioral.Delegation.kotlin

class BasicPrinter : Printer {
    override fun print(message: String) {
        println("Basic Printing: $message")
    }
}