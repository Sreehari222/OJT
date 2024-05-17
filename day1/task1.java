import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the length");
        int x= scanner.nextInt();

        System.out.println("enter the length");
        int y= scanner.nextInt();

        if(x==y){
            System.out.println("it is a squre");
        }
        else{
            System.out.println("it is not a squre");
        }

    }
}