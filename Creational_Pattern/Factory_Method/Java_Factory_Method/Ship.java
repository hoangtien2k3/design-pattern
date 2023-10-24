package Creational_Pattern.Factory_Method.Java_Factory_Method;

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("SeaTransport");
    }
}