import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        char lowercaseChar = Character.toLowerCase(inputChar);

        System.out.println("\n----- Vowel Check -----");
        switch (lowercaseChar) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("'" + inputChar + "' is a vowel.");
                break;
            default:
                System.out.println("'" + inputChar + "' is not a vowel.");
                break;
        }

        scanner.close();
    }
}
