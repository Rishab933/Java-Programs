import java.util.Scanner;

public class OperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.print("Enter a number to compare: ");
        int compareNum = scanner.nextInt();

        System.out.println("Relational Operators:");
        System.out.println(num1 + " > " + compareNum + ": " + (num1 > compareNum));
        System.out.println(num1 + " < " + compareNum + ": " + (num1 < compareNum));
        System.out.println(num1 + " == " + compareNum + ": " + (num1 == compareNum));
        System.out.println(num1 + " != " + compareNum + ": " + (num1 != compareNum));

        System.out.print("Enter a boolean value (true or false): ");
        boolean boolValue = scanner.nextBoolean();

        System.out.println("Logical Operators:");
        System.out.println("!(NOT) " + boolValue + ": " + !boolValue);
        System.out.println(num1 + " > 0 && " + num2 + " < 10: " + (num1 > 0 && num2 < 10));
        System.out.println(num1 + " < 0 || " + num2 + " > 10: " + (num1 < 0 || num2 > 10));

        scanner.close();
    }
}
