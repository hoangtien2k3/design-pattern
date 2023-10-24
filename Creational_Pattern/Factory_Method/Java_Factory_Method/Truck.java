package Creational_Pattern.Factory_Method.Java_Factory_Method;

class Truck implements Transport {
    @Override
    public void deliver() {
            System.out.println("RoadTransport");
    }
}
