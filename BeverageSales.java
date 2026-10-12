// Subclass that extends (inherits from) the Beverage class
public class BeverageSales extends Beverage {

    // Constructor passes the values up to the Beverage class using super
    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    // Prints the beverage type, city and total sales
    @Override
    public void printReport() {
        System.out.println("\nNUMBER 1 COFFEE HUT REPORT");
        System.out.println("******************************");
        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
