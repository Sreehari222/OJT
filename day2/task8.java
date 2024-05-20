import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();
        
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();
        

        double Percentage = calculatePercentage(classesHeld, classesAttended);
        

        System.out.println("Percentage of classes attended: " + Percentage + "%");

        if (isAllowedToSitInExam(Percentage)) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }
        
        scanner.close();
    }

    public static double calculatePercentage(int classesHeld, int classesAttended) {
        return ((double) classesAttended / classesHeld) * 100;
    }
    

    public static boolean isAllowedToSitInExam(double Percentage) {
        return Percentage >= 75.0;
    }
}
