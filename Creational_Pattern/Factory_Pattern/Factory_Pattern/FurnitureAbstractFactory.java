package Creational_Pattern.Factory_Pattern.Factory_Pattern;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Sofa;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Table;

public interface FurnitureAbstractFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
