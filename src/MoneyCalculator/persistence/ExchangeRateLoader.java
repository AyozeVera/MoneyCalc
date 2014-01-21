package MoneyCalculator.persistence;

public abstract class ExchangeRateLoader {

    static ExchangeRateLoader instances;
   

    public ExchangeRateLoader() {
    }

    public abstract ExchangeRateLoader getInstance();

    public abstract void load();
}
