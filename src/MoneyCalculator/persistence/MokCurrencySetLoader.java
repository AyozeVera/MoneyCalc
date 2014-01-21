
package MoneyCalculator.persistence;

import MoneyCalculator.model.Currency;
import MoneyCalculator.model.CurrencySet;


public class MokCurrencySetLoader extends CurrencySetLoader{

    public MokCurrencySetLoader() {
        super();
    }
    
     @Override
     public CurrencySetLoader getInstance() {
        if (instances == null)
            instances = new MokCurrencySetLoader() {};
        return instances;
    }
     @Override
    public void load() {
        CurrencySet set = CurrencySet.getInstance();
        set.clear(); //APAÑO
        set.add(new Currency("Dolar americano", "USD", "$"));
        set.add(new Currency("Dolar canadiense", "CAD", "$"));
        set.add(new Currency("Euro", "EUR", "€"));
    }
}
