import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();


        if (a > b) {
            System.out.println("The greatest number is: " + a);
        }  else {
            System.out.println("the greatest number is."+b);
        }


        scanner.close();
    }
}
