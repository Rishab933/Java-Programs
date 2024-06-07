import java.util.Scanner;

class Label {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, sec, sub;
        int roll, c;

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your class: ");
        c = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your section: ");
        sec = sc.nextLine();

        System.out.println("Enter your Roll number: ");
        roll = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter your subject: ");
        sub = sc.nextLine();

        System.out.println("\tLABEL");
        System.out.println("Name: " + name);
        System.out.println("Class: " + c);
        System.out.println("Section: " + sec);
        System.out.println("Roll no: " + roll);
        System.out.println("Subject: " + sub);
        sc.close();
    }
}
