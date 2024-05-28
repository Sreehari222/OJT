public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

   
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
    
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Add: " + Calculator.add(num1, num2));          
        System.out.println("Sub: " + Calculator.subtract(num1, num2));   
        System.out.println("Mul: " + Calculator.multiply(num1, num2));
        System.out.println("Div: " + Calculator.divide(num1, num2));       

    }
}
