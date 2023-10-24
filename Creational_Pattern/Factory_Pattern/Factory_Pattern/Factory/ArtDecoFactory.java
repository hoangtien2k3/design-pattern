package Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.ChairShape.ChairArtDeco;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.FurnitureAbstractFactory;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Chair;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Sofa;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.IteamInterface.Table;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.SofaShape.SofaArtDeco;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.TableShape.TableArtDeco;

public class ArtDecoFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new ChairArtDeco();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArtDeco();
    }

    @Override
    public Table createTable() {
        return new TableArtDeco();
    }
}
