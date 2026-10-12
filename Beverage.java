// Abstract class: cannot be instantiated, it is a base for other classes
public abstract class Beverage implements IBeverage {

    // Variables to store the beverage details
    private String beverageType;
    private String city;
    private int totalSales;

    // Constructor that accepts the beverage type, city and total sales
    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    // Get methods from the IBeverage interface
    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method: the subclass must write the code for it
    public abstract void printReport();
}
