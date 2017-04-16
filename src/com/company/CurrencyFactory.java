package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by promoscow on 15.04.17.
 */
public class CurrencyFactory {
    public static Map<String, Currency> currencies = new HashMap<>();

    public CurrencyFactory() {
    }

    public static Currency getCurrencyByCode(String currencyCode) {
        Currency result = null;
        if (currencies.containsKey(currencyCode)) return currencies.get(currencyCode);
        result = new Currency();
        currencies.put(currencyCode, result);
        return result;
    }

    public static Collection<Currency> getAllCurrencies() {
        return currencies.values();
    }
}
