package MoneyCalculator.persistence;

public abstract class CurrencySetLoader {

    static CurrencySetLoader instances;

    public CurrencySetLoader() {
    }

    public abstract CurrencySetLoader getInstance();

    public abstract void load();
}
