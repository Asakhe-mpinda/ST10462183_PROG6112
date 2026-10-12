import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single arrays: one for the cities, one for the beverage names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] beverages = {"COFFEE", "TEA", "BOBA TEA"};

        // Two-dimensional array: rows = cities, columns = beverages
        double[][] sales = new double[3][3];

        // Single array to store the total sales for each city
        double[] cityTotals = new double[3];

        // Variable to store the total sales for all cities
        double grandTotal = 0;

        System.out.println("-----------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
        System.out.println("-----------------------------------------");

        // Outer loop goes through each city (rows)
        for (int row = 0; row < cities.length; row++) {
            // Inner loop goes through each beverage (columns)
            for (int col = 0; col < beverages.length; col++) {
                System.out.print("Enter the number of " + beverages[col]
                        + " sales for " + cities[row] + ": ");
                sales[row][col] = input.nextDouble();

                // Add this sale to the city total
                cityTotals[row] += sales[row][col];
            }
            // Add the city total to the overall total
            grandTotal += cityTotals[row];
        }

        // Print the report heading and the column headings
        System.out.println("\n-----------------------------------------");
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("-----------------------------------------");
        System.out.printf("%-20s", "");
        for (int col = 0; col < beverages.length; col++) {
            System.out.printf("%-12s", beverages[col]);
        }
        System.out.println();

        // Print each city and its sales for every beverage
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-20s", cities[row]);
            for (int col = 0; col < beverages.length; col++) {
                System.out.printf("%-12.2f", sales[row][col]);
            }
            System.out.println();
        }

        // Print the total sales for each city
        System.out.println("\n-----------------------------------------");
        System.out.println("PRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------");
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-20sR%.2f%n", cities[row], cityTotals[row]);
        }

        // Print the total sales for all cities
        System.out.println("\nTOTAL SALES FOR CITIES: R" + String.format("%.2f", grandTotal));
        System.out.println("-----------------------------------------");

        input.close();
    }
}
