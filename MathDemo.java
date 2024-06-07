import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter an exponent: ");
        double exponent = scanner.nextDouble();

        double resultPower = Math.pow(base, exponent);
        System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + resultPower);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        double resultSqrt = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + resultSqrt);

        
        scanner.close();
    }
}
