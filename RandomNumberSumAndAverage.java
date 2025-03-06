import java.util.Random;

public class RandomNumberSumAndAverage {

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[100];
        int sum = 0;

        // Generate 100 random numbers between 1 and 1000
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(1000) + 1; // Generates numbers from 1 to 1000
            sum += randomNumbers[i]; // Add to sum
        }
        

        // Calculate average
        double average = (double) sum / randomNumbers.length;

        // Output the results
        System.out.println("Sum of the random numbers: " + sum);
        System.out.printf("Average of the random numbers: %.2f\n", average);
    }
}