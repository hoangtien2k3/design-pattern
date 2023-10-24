package Creational_Pattern.Factory_Pattern.Factory_Pattern.ChairShape;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;

public class ChairArtDeco implements Chair {
    @Override
    public void create() {
        System.out.println("Create ChairArtDeco");
    }
}
