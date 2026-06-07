public class NumberLoop {
    public static void main(String[] args) {
        // For loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Print the current number
            System.out.println(i);

            // Stop the loop when number 7 is reached
            if (i == 7) {
                break;
            }
        }
    }
}
