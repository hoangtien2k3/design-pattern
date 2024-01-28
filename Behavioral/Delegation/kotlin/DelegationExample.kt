package Behavioral.Delegation.kotlin

fun main() {
    // Tạo một đối tượng BasicPrinter
    val basicPrinter = BasicPrinter()

    // Tạo một đối tượng FancyPrinter chuyển giao hành vi in ấn cho BasicPrinter
    val fancyPrinter = FancyPrinter(basicPrinter)

    // Sử dụng FancyPrinter với hành vi in ấn của BasicPrinter
    fancyPrinter.print("Hello, Delegation Pattern!")

    // Sử dụng hành vi khác của FancyPrinter
    fancyPrinter.fancyPrint("Fancy Greetings!")
}