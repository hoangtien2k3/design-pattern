package Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.ChairShape.ChairVictorian;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.FurnitureAbstractFactory;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Sofa;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Table;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.SofaShape.SofaVictorian;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.TableShape.TableVictorian;

public class VictorianFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair(){
        return new ChairVictorian();
    }

    @Override
    public Sofa createSofa(){
        return new SofaVictorian();
    }

    @Override
    public Table createTable(){
        return new TableVictorian();
    }
}
