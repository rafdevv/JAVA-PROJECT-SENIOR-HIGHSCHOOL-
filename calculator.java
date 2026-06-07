import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        double result;

        // Perform addition
        result = num1 + num2;
        System.out.println("Addition: " + result);

        // Perform subtraction
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        // Perform multiplication
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        // Perform division
        if (num2 != 0) {
            result = (double) num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}

