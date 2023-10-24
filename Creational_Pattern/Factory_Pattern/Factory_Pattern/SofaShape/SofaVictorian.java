package Creational_Pattern.Factory_Pattern.Factory_Pattern.SofaShape;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Sofa;

public class SofaVictorian implements Sofa {
    @Override
    public void create() {
        System.out.println("Create SofaVictorian");
    }
}