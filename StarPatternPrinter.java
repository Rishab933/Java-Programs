import java.util.Scanner;

public class StarPatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- Star Pattern Printer Menu -----");
            System.out.println("1. Print Pattern 1");
            System.out.println("2. Print Pattern 2");
            System.out.println("3. Quit");

            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printPattern1();
                    break;
                case 2:
                    printPattern2();
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

    private static void printPattern1() {
        System.out.println("\n----- Pattern 1 -----");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printPattern2() {
        System.out.println("\n----- Pattern 2 -----");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
