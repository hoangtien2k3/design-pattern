package Behavioral.Delegation.Example

// Implement đèn sáng
class CarHeadlights : Headlights {
    override fun turnOn() {
        println("Car headlights are turned on")
    }

    override fun turnOff() {
        println("Car headlights are turned off")
    }
}