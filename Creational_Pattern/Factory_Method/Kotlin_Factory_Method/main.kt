package Creational_Pattern.Factory_Method.Kotlin_Factory_Method

fun main() {
    val transport = TransportFactory.getTransport(TransportType.TRUCK)
    transport.deliver() // RoadTransport
}