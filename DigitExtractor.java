import java.util.Scanner;

public class DigitExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("\n----- Extracted Digits -----");
        extractDigits(number);

        scanner.close();
    }

    private static void extractDigits(int num) {
      
        num = Math.abs(num);

 
        int originalNum = num;
        int digit;
        int placeValue = 1;

        while (originalNum >= 10) {
            originalNum /= 10;
            placeValue *= 10;
        }
        while (num > 0) {
            digit = num / placeValue;
            System.out.print(digit + "\n");

            num %= placeValue;
            placeValue /= 10;
        }
    }
}
