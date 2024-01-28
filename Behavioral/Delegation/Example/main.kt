package Behavioral.Delegation.Example

fun main() {
    // Tạo một đối tượng đèn sáng
    val carHeadlights = CarHeadlights()

    // Tạo một đối tượng Car chuyển giao chức năng đèn sáng cho đối tượng đèn sáng
    val car = Car(carHeadlights)

    // Sử dụng đối tượng Car với chức năng đèn sáng
    car.start()
    car.stop()
}