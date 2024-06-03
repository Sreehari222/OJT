import java.util.Scanner;

public class ladderifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from this list 1 2 3:");
        
        int num = scanner.nextInt();
        if (num == 1) {

            System.out.println("HAi");
            
        } else if (num ==2) {

            System.out.println("good morning");

        } else {

            System.out.println("sorry");
        }
        
        scanner.close();
    }
}
