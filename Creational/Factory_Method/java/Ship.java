package Creational.Factory_Method.java;

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Sea Transport");
    }
}