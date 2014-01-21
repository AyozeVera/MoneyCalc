package MoneyCalculator.persistence;

import MoneyCalculator.model.Currency;
import MoneyCalculator.model.ExchangeRate;
import MoneyCalculator.model.ExchangeRateSet;
import MoneyCalculator.model.Number;

public class MokExchangeRateLoader extends ExchangeRateLoader {

    @Override
    public ExchangeRateLoader getInstance() {
        if (instances == null) {
            instances = new MokExchangeRateLoader();
        }
        return instances;
    }

    public MokExchangeRateLoader() {
        super();
    }

    @Override
    public void load() {
        ExchangeRateSet rates = ExchangeRateSet.getInstance();
        rates.clear();
        rates.add(new ExchangeRate(new Currency("USD"), new Currency("USD"), new Number(1)));
        rates.add(new ExchangeRate(new Currency("USD"), new Currency("EUR"), new Number(2)));
        rates.add(new ExchangeRate(new Currency("USD"), new Currency("CAD"), new Number(3)));
        rates.add(new ExchangeRate(new Currency("EUR"), new Currency("EUR"), new Number(1)));
        rates.add(new ExchangeRate(new Currency("EUR"), new Currency("USD"), new Number(1, 2)));
        rates.add(new ExchangeRate(new Currency("EUR"), new Currency("CAD"), new Number(3, 2)));
        rates.add(new ExchangeRate(new Currency("CAD"), new Currency("CAD"), new Number(1)));
        rates.add(new ExchangeRate(new Currency("CAD"), new Currency("USD"), new Number(1, 3)));
        rates.add(new ExchangeRate(new Currency("CAD"), new Currency("EUR"), new Number(2, 3)));
    }
}
