package Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.ChairShape.ChairModern;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.FurnitureAbstractFactory;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Sofa;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Table;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.SofaShape.SofaModern;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.TableShape.TableModern;

public class ModernFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair(){
        return new ChairModern();
    }

    @Override
    public Sofa createSofa(){
        return new SofaModern();
    }

    @Override
    public Table createTable(){
        return new TableModern();
    }
}
