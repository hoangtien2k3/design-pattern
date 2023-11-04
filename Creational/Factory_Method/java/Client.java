package Creational.Factory_Method.java;

public class Client {
    public static void main(String[] args) {
        Transport transport = TransportFactory.getTransport(TransportType.SHIP);
        transport.deliver(); // SeaTransport
    }
}