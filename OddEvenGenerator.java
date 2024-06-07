import java.util.Scanner;

public class OddEvenGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();

        System.out.println("\n----- Odd/Even Number Generator Menu -----");
        System.out.println("1. Generate Odd Numbers");
        System.out.println("2. Generate Even Numbers");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                generateOddNumbers(n);
                break;
            case 2:
                generateEvenNumbers(n);
                break;
            default:
                System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        scanner.close();
    }

    private static void generateOddNumbers(int limit) {
        System.out.println("\n----- Odd Numbers -----");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
    }

    private static void generateEvenNumbers(int limit) {
        System.out.println("\n----- Even Numbers -----");
        for (int i = 2; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
    }
}
