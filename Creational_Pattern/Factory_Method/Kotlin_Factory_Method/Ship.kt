package Creational_Pattern.Factory_Method.Kotlin_Factory_Method

class Ship : Transport {
    override fun deliver() {
        println("SeaTransport")
    }
}