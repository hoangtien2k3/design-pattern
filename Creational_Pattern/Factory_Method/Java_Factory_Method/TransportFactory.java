package Creational_Pattern.Factory_Method.Java_Factory_Method;

class TransportFactory{
    private TransportFactory() { }

    public static final Transport getTransport(TransportType transportType) {
        switch (transportType) {
            case TRUCK:
                return new Truck();
            case SHIP:
                return new Ship();
            default:
                throw new IllegalArgumentException("This Transport type is unsupported");
        }
    }
}