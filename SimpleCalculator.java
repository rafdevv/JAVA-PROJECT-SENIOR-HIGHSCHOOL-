
import java.util.Scanner;


public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int number1 = input.nextInt();


        System.out.println("Enter the second number:");
        int number2 = input.nextInt();


        System.out.println ("Sum:" + (number1 + number2));
        System.out.println("Dif :" + (number1 - number2));
        System.out.println("Product :" + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        

}
}






