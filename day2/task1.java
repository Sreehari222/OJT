import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth =scanner.nextInt();
        
        if(length==breadth){
            System.out.println("it is a squre");
        }
        else{
            System.out.println("it is not a squre");
        }
    } 

}
