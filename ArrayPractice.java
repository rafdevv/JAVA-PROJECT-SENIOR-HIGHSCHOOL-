public class ArrayPractice {
    public static void main(String[] args) {

        // === Task 1: Array of 5 names and print each ===
        String[] names = {"Sunshine", "Cruz", "Kristina", "Diana", "Ronald"};
        System.out.println("Names in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        // === Task 2: Modify second element of int array and print updated array ===
        int[] numbers = {10, 20, 30, 40, 50};
        numbers[1] = 99;  // Modify second element (index 1)

        System.out.println("\nUpdated integer array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // === Task 3: Find max value in an array ===
        int[] data = {12, 45, 7, 89, 34, 67};
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("\n\nMaximum value in the array: " + max);
    }
}
