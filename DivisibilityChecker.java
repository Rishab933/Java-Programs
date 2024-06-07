import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("\n----- Divisibility Check -----");
        switch (number) {
            case 0:
                System.out.println("The number is divisible by 2, 3, and 5 (since it is 0).");
                break;
            case 1:
                System.out.println("The number is not divisible by 2, 3, or 5.");
                break;
            default:
                if (number % 2 == 0) {
                    System.out.println("The number is divisible by 2.");
                }
                if (number % 3 == 0) {
                    System.out.println("The number is divisible by 3.");
                }
                if (number % 5 == 0) {
                    System.out.println("The number is divisible by 5.");
                }
                if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
                    System.out.println("The number is not divisible by 2, 3, or 5.");
                }
                break;
        }

        scanner.close();
    }
}
