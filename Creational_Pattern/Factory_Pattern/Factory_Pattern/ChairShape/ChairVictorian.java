package Creational_Pattern.Factory_Pattern.Factory_Pattern.ChairShape;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;

public class ChairVictorian implements Chair {
    @Override
    public void create() {
        System.out.println("Create ChairVictorian");
    }
}