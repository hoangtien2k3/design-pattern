package Creational_Pattern.Factory_Pattern.Factory_Pattern;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;

public class Client {
    public static void main(String []args){
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(StyleType.ARTDECO);
        Chair chair = factory.createChair();
        chair.create(); // Create ChairArtDeco
    }
}
