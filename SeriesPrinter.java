import java.util.Scanner;

public class SeriesPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n----- Series Printer Menu -----");
            System.out.println("1. Print Series n/(n+1)");
            System.out.println("2. Print Series n/(n+2)");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printSeries1();
                    break;
                case 2:
                    printSeries2();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void printSeries1() {
        System.out.println("\n----- Series n/(n+1) -----");
        for (int n = 1; n <= 10; n++) {
            double result = (double) n / (n + 1);
            System.out.printf("%.2f ", result);
        }
    }

    private static void printSeries2() {
        System.out.println("\n----- Series n/(n+2) -----");
        for (int n = 1; n <= 10; n++) {
            double result = (double) n / (n + 2);
            System.out.printf("%.2f ", result);
        }
    }
}
