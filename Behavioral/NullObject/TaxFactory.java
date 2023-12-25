package Behavioral.NullObject;

import java.util.HashMap;
import java.util.Map;

public class TaxFactory {
    private static final Map<String, Double> VATS = new HashMap<>();

    static {
        VATS.put("China", 1.3);
        VATS.put("Germany", 1.45);
        VATS.put("Vietnam", 1.1);
    }

    public static Tax getTaxByCountry(String country) {
        Double vat = VATS.get(country);
        if (vat != null) {
            return new RealTax(country, vat);
        }
        return new NullTax(country);
    }
}
