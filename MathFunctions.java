import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double inputNumber = scanner.nextDouble();
 
        double floorResult = Math.floor(inputNumber);
        System.out.println("Floor value: " + floorResult);

        double ceilResult = Math.ceil(inputNumber);
        System.out.println("Ceil value: " + ceilResult);

        double absResult = Math.abs(inputNumber);
        System.out.println("Absolute value: " + absResult);

        scanner.close();
    }
}
