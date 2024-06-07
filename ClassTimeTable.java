import java.util.Scanner;

public class ClassTimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\tClass 9 Weekly Time Table");
        System.out.print("Monday:\t");
        printSubject("Maths");
        printSubject("Hindi");
        printBreak();
        printSubject("English");
        printSubject("History");
        printSubject("Geography");
        System.out.println();

        System.out.print("Tuesday:");
        printSubject("Physics");
        printSubject("Chemistry");
        printBreak();
        printSubject("Biology");
        printSubject("Games");
        System.out.println();

        System.out.print("Wednesday:");
        printSubject("Maths");
        printSubject("Hindi");
        printBreak();
        printSubject("English");
        printSubject("History");
        printSubject("Geography");
        System.out.println();

        System.out.print("Thursday:");
        printSubject("Physics");
        printSubject("Chemistry");
        printBreak();
        printSubject("Biology");
        printSubject("Games");
        System.out.println();

        System.out.print("Friday:\t");
        printSubject("Maths");
        printSubject("Hindi");
        printBreak();
        printSubject("English");
        printSubject("History");
        printSubject("Geography");
        System.out.println();
        scanner.close();
    }

    private static void printSubject(String subject) {
        System.out.print("\t" + subject);
    }


    private static void printBreak() {
        System.out.print("   -- Break (30 minutes) --   ");
    }
}
