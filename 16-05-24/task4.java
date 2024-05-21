import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();
        
    
        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();
        
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        System.out.printf("The net bonus amount is:"+ bonus);
        
        scanner.close();
    }
}
