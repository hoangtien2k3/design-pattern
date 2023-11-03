package Creational.Factory_Method.kotlin

class TransportFactory {
    companion object {
        fun getTransport(type: TransportType) : Transport = when(type) {
            TransportType.TRUCK -> Truck()
            TransportType.SHIP -> Ship()
        }
    }
}