import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            
            System.out.println("\n----- Shape Calculator Menu -----");
            System.out.println("1. Calculate Area of Rectangle");
            System.out.println("2. Calculate Area of Circle");
            System.out.println("3. Calculate Volume of Cylinder");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateRectangleArea();
                    break;
                case 2:
                    calculateCircleArea();
                    break;
                case 3:
                    calculateCylinderVolume();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void calculateRectangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    private static void calculateCircleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of the circle: " + area);
    }

    private static void calculateCylinderVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
