import java.util.Scanner;

public class DivisibleBySeven {

    // Method to count elements divisible by 7
    public static int countDivisibleBySeven(int[] array) {
        int count = 0; // Initialize count
        for (int num : array) {
            if (num % 7 == 0) { // Check if the number is divisible by 7
                count++; // Increment count
            }
        }
        return count; // Return the count
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Create the array
        int[] array = new int[size];
        
        // Input elements into the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Call the method and get the count of elements divisible by 7
        int count = countDivisibleBySeven(array);
        
        // Display the result
        System.out.println("Number of elements divisible by 7: " + count);
        
        scanner.close();
    }
}