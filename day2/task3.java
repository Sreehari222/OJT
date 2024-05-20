import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
         int UNIT_PRICE = 100;

        System.out.print("Enter the quantity:");
        int quantity = scanner.nextInt();

        double totalCost = quantity * UNIT_PRICE;


        if (totalCost > 1000) {
            totalCost = totalCost * 0.90; 
        }

        System.out.println("The total cost for the purchase is: " + totalCost);

        scanner.close();
    }
}
