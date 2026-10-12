import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Show the beverage menu
        System.out.println("Select the beverage type");
        System.out.println("1) COFFEE");
        System.out.println("2) TEA");
        System.out.println("3) BOBA");

        int choice = input.nextInt();
        input.nextLine(); // clear the Enter key left in the Scanner

        // Decide the beverage name from the user's choice
        String beverageType;
        if (choice == 1) {
            beverageType = "COFFEE";
        } else if (choice == 2) {
            beverageType = "TEA";
        } else if (choice == 3) {
            beverageType = "BOBA";
        } else {
            System.out.println("Invalid choice. Please run the program again.");
            input.close();
            return; // stop the program
        }

        // Ask for the city
        System.out.print("Enter the city: ");
        String city = input.nextLine().toUpperCase();

        // Ask for the total sales
        System.out.print("Enter the total sales of " + beverageType
                + " beverages in " + city + " :");
        int totalSales = input.nextInt();

        // Create the object and print the report
        BeverageSales sales = new BeverageSales(beverageType, city, totalSales);
        sales.printReport();

        input.close();
    }
}
