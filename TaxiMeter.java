import java.util.Scanner;

public class TaxiMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled in kilometers: ");
        double distance = scanner.nextDouble();


        double initialFareINR = 50.00; 
        double ratePerKilometerINR = 25.00; 
        double totalFareINR = initialFareINR + (distance - 1) * ratePerKilometerINR;

     
        if (distance > 10) {
            
            totalFareINR *= 0.9;
        }

        System.out.println("\n----- Taxi Bill -----");
        System.out.println("Distance Traveled: " + distance + " kilometers");
        System.out.println("Initial Fare: ₹" + initialFareINR);
        System.out.println("Fare per Kilometer: ₹" + ratePerKilometerINR);
        System.out.println("Total Fare: ₹" + totalFareINR);

        scanner.close();
    }
}
