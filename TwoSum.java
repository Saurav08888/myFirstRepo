import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // Return the indices
            }
            
            // Store the number and its index in the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Create the array
        int[] nums = new int[size];
        
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Input the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        // Find the two indices
        int[] result = findTwoSum(nums, target);
        
        // Output the result
        if (result.length == 0) {
            System.out.println("No two numbers add up to the target.");
        } else {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        }
        
        scanner.close();
    }
}