public class MethodOverloading {

    
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    
    public static void main(String[] args) {
       
        int result1 = multiply(5, 9);
        System.out.println("multiply(5, 9) = " + result1);

        
        double result2 = multiply(4.5, 6.0);
        System.out.println("multiply(4.5, 6.0) = " + result2);

        
        int result3 = multiply(2, 3, 4);
        System.out.println("multiply(2, 3, 4) = " + result3);
    }
}
