package Creational_Pattern.Factory_Pattern.Factory_Pattern;

import Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory.ArtDecoFactory;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory.ModernFactory;
import Creational_Pattern.Factory_Pattern.Factory_Pattern.Factory.VictorianFactory;

public class FurnitureFactory {
    private FurnitureFactory() { }

    public static final FurnitureAbstractFactory getFactory(StyleType styleType) {
        switch (styleType) {
            case ARTDECO:
                return new ArtDecoFactory();
            case VICTORIAN:
                return new VictorianFactory();
            case MODERN:
                return new ModernFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported");
        }
    }
}
