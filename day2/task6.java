import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of 1person: ");
        int age1 = scanner.nextInt();
        
        System.out.print("Enter the age of 2person: ");
        int age2 = scanner.nextInt();
        
        System.out.print("Enter the age of 3person: ");
        int age3 = scanner.nextInt();

        int oldest = age1;
        int youngest = age1;

        oldest =Math.max(Math.max(age1,age2),age3);
        youngest =Math.min(Math.min(age1,age2),age3);

        System.out.println("The oldest person is " + oldest);
        System.out.println("The youngest person is " + youngest);
        
        scanner.close();
    }
}
