package MoneyCalculator.persistence;

public abstract class CurrencySetLoader {
//
//    private static final String URL = "jdbc:oracle:thin:@10.22.146.238:1521:orcl";
//     private static final String USER = "system";
//     private static final String PASSWORD = "orcl";
//
//     public static void main(String[] args) throws SQLException {
//     DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//     Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
//     Statement statement = connection.createStatement();
//     ResultSet resulSet = statement.executeQuery("SELECT * FROM CAMBIO_EUR_A");
//     while (resulSet.next()) {
//     System.out.print(resulSet.getString("DIVISA") + " ");
//     System.out.println(resulSet.getBigDecimal("CAMBIO"));
//     }
//     connection.close();
//     }
    static CurrencySetLoader instances;

    public CurrencySetLoader() {
    }

    public abstract CurrencySetLoader getInstance();

    public abstract void load();
}
