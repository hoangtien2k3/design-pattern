package Creational.Factory_Method.kotlin

class Ship : Transport {
    override fun deliver() {
        println("SeaTransport")
    }
}