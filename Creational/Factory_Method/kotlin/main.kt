package Creational.Factory_Method.kotlin

fun main() {
    val transport = TransportFactory.getTransport(TransportType.TRUCK)
    transport.deliver() // RoadTransport
}