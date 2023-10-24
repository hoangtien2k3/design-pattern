package Creational_Pattern.Factory_Method.Java_Factory_Method;

public class Client {
    public static void main(String[] args) {
        Transport transport = TransportFactory.getTransport(TransportType.SHIP);
        transport.deliver(); //SeaTransport
    }
}