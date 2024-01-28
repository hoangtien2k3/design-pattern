package Behavioral.Delegation.Example


// Lớp Car chuyển giao trách nhiệm của chức năng đèn cho một đối tượng đèn sáng
class Car(private val headlights: Headlights) {
    fun start() {
        println("Car is starting...")
        // Gọi hành vi bật đèn từ đối tượng đèn sáng
        headlights.turnOn()
    }

    fun stop() {
        println("Car is stopping...")
        // Gọi hành vi tắt đèn từ đối tượng đèn sáng
        headlights.turnOff()
    }
}