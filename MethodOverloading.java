public class MethodOverloading {

    // Multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiply two decimal numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Multiply three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Main method to test the multiply methods
    public static void main(String[] args) {
        // Test multiply(int, int)
        int result1 = multiply(5, 9);
        System.out.println("multiply(5, 9) = " + result1);

        // Test multiply(double, double)
        double result2 = multiply(4.5, 6.0);
        System.out.println("multiply(4.5, 6.0) = " + result2);

        // Test multiply(int, int, int)
        int result3 = multiply(2, 3, 4);
        System.out.println("multiply(2, 3, 4) = " + result3);
    }
}
