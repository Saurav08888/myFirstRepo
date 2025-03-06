import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static String longestSubstringWithoutRepeating(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start index of the current substring
        int longestStart = 0; // Start index of the longest substring found

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the character is already in the map and its index is greater than or equal to the start index
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // Move the start index to the right of the last occurrence of the current character
                start = charIndexMap.get(currentChar) + 1;
            }

            // Update the character's index in the map
            charIndexMap.put(currentChar, i);
            // Calculate the length of the current substring
            int currentLength = i - start + 1;

            // Update maxLength and longestStart if necessary
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestStart = start; // Update the start index of the longest substring
            }
        }

        // Return the longest substring
        return s.substring(longestStart, longestStart + maxLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find the longest substring without repeating characters
        String result = longestSubstringWithoutRepeating(input);
        
        // Output the result
        System.out.println("Longest substring without repeating characters: " + result);
        
        scanner.close();
    }
}