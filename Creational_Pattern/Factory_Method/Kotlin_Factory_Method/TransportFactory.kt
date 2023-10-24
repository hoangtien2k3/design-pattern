package Creational_Pattern.Factory_Method.Kotlin_Factory_Method

class TransportFactory {
    companion object {
        fun getTransport(type: TransportType) : Transport = when(type) {
            TransportType.TRUCK -> Truck()
            TransportType.SHIP -> Ship()
        }
    }
}