package Creational.Factory_Method.java;

class TransportFactory{
    private TransportFactory() { }

    public static final Transport getTransport(TransportType transportType) {
/*        switch (transportType) {
            case TRUCK:
                return new Truck();
            case SHIP:
                return new Ship();
            default:
                throw new IllegalArgumentException("This Transport type is unsupported");
        }*/

        return switch (transportType) {
            case TRUCK -> new Truck();
            case SHIP -> new Ship();
            default -> throw new IllegalArgumentException("This Transport type is unsupported");
        };

    }
}