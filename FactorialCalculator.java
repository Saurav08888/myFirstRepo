import java.util.Scanner;

public class FactorialCalculator {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long result = factorial(number);
            // Display the result
            System.out.println("The factorial of " + number + " is: " + result);
        }
        
        scanner.close();
    }
}