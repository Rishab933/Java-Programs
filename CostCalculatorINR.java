import java.util.Scanner;

public class CostCalculatorINR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();
        double costPerUnitINR = 750.0; 
        int slab1Limit = 50; 
        double costPerUnitSlab2INR = 712.5; 

        double totalCostINR;

        if (quantity <= slab1Limit) {
           
            totalCostINR = quantity * costPerUnitINR;
        } else {
            
            int quantityInSlab2 = quantity - slab1Limit;
            totalCostINR = slab1Limit * costPerUnitINR + quantityInSlab2 * costPerUnitSlab2INR;
        }

        System.out.println("\n----- Cost Calculation -----");
        System.out.println("Quantity: " + quantity + " units");

        if (quantity <= slab1Limit) {
            System.out.println("Cost per unit: ₹" + costPerUnitINR);
            System.out.println("Total Cost: ₹" + totalCostINR);
        } else {
            System.out.println("Cost per unit (Slab 1): ₹" + costPerUnitINR);
            System.out.println("Cost per unit (Slab 2): ₹" + costPerUnitSlab2INR);
            System.out.println("Total Cost: ₹" + totalCostINR);
        }

        scanner.close();
    }
}
