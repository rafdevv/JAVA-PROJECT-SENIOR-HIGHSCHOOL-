import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        double result;

        
        result = num1 + num2;
        System.out.println("Addition: " + result);

        
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

       
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        
        if (num2 != 0) {
            result = (double) num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}

