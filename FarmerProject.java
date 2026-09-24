import java.util.Scanner;

public class FarmerProject {

    static Scanner sc = new Scanner(System.in);

    static String cropName;
    static double quantity;
    static double marketPrice;
    static double quantitySold = 0;
    static double totalSales = 0;

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n=============================================");
            System.out.println(" FARMER'S MARKET PRICE AND SALES TRACKER");
            System.out.println("=============================================");

            System.out.println("1. Enter Crop Details");
            System.out.println("2. View Crop Details");
            System.out.println("3. Update Market Price");
            System.out.println("4. Record Sale");
            System.out.println("5. Calculate Total Sales");
            System.out.println("6. View Remaining Quantity");
            System.out.println("7. Display Summary");
            System.out.println("8. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    enterCropDetails();
                    break;

                case 2:
                    viewCropDetails();
                    break;

                case 3:
                    updatePrice();
                    break;

                case 4:
                    recordSale();
                    break;

                case 5:
                    calculateSales();
                    break;

                case 6:
                    viewRemainingQuantity();
                    break;

                case 7:
                    displaySummary();
                    break;

                case 8:
                    System.out.println("\nThank you for using the system!");
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    static void enterCropDetails() {

        sc.nextLine();

        System.out.print("Enter Crop Name: ");
        cropName = sc.nextLine();

        System.out.print("Enter Available Quantity (kg): ");
        quantity = sc.nextDouble();

        System.out.print("Enter Market Price per kg: ₹");
        marketPrice = sc.nextDouble();

        quantitySold = 0;
        totalSales = 0;

        System.out.println("\nCrop details saved successfully.");
    }

    static void viewCropDetails() {

        System.out.println("\n========== CROP DETAILS ==========");

        System.out.println("Crop Name: " + cropName);
        System.out.println("Available Quantity: " + quantity + " kg");
        System.out.println("Market Price: ₹" + marketPrice + "/kg");
        System.out.println("Quantity Sold: " + quantitySold + " kg");
    }

    static void updatePrice() {

        System.out.print("Enter new market price per kg: ₹");
        marketPrice = sc.nextDouble();

        System.out.println("Market price updated successfully.");
    }

    static void recordSale() {

    System.out.print("Enter quantity sold (kg): ");
    double sold = sc.nextDouble();

    if (sold > 0 && sold <= quantity) {

        quantitySold = quantitySold + sold;
        quantity = quantity - sold;

        double saleAmount = sold * marketPrice;
        totalSales = totalSales + saleAmount;

        System.out.println("Sale recorded successfully.");
        System.out.println("Sale Amount: ₹" + saleAmount);

    } else {

        System.out.println("Invalid quantity.");
    }
}

static void calculateSales() {

    System.out.println("\n========== SALES SUMMARY ==========");

    System.out.println("Quantity Sold: " + quantitySold + " kg");
    System.out.println("Total Sales: ₹" + totalSales);
}

static void viewRemainingQuantity() {

    System.out.println("\n========== REMAINING QUANTITY ==========");

    System.out.println("Remaining Quantity: " + quantity + " kg");
}

static void displaySummary() {

    System.out.println("\n=============================================");
    System.out.println("              FARMER SUMMARY");
    System.out.println("=============================================");

    System.out.println("Crop Name: " + cropName);
    System.out.println("Current Market Price: ₹" + marketPrice + "/kg");
    System.out.println("Quantity Sold: " + quantitySold + " kg");
    System.out.println("Remaining Quantity: " + quantity + " kg");
    System.out.println("Total Sales: ₹" + totalSales);

    System.out.println("=============================================");
}
}