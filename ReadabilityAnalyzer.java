import java.util.Scanner;

public class ReadabilityAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept text input from the user
        System.out.println("Enter a text to analyze its readability:");
        String text = scanner.nextLine();
        
        // Calculate readability metrics
        int characters = countCharacters(text);
        int words = countWords(text);
        int sentences = countSentences(text);
        int syllables = countSyllablesInText(text);
        
        // Calculate the Flesch-Kincaid readability score
        double readabilityScore = calculateFleschKincaidScore(words, sentences, syllables);
        
        // Output the results
        System.out.println("Total Characters: " + characters);
        System.out.println("Total Words: " + words);
        System.out.println("Total Sentences: " + sentences);
        System.out.println("Total Syllables: " + syllables);
        System.out.printf("Readability Score: %.2f\n", readabilityScore);
        System.out.println("Readability Level: " + categorizeReadability(readabilityScore));
        
        scanner.close();
    }

    private static int countCharacters(String text) {
        return text.replaceAll("\\s+", "").length(); // Remove whitespace and count characters
    }

    private static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length; // Split by whitespace and count words
    }

    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        return sentences.length; // Split by sentence-ending punctuation and count sentences
    }

    private static int countSyllablesInWord(String word) {
        word = word.toLowerCase();
        int syllableCount = 0;
        boolean lastWasVowel = false;

        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                if (!lastWasVowel) {
                    syllableCount++;
                    lastWasVowel = true;
                }
            } else {
                lastWasVowel = false;
            }
        }

        // Adjust for silent 'e' at the end
        if (word.endsWith("e")) {
            syllableCount--;
        }

        // Ensure at least one syllable
        return Math.max(syllableCount, 1);
    }

    private static int countSyllablesInText(String text) {
        int totalSyllables = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            totalSyllables += countSyllablesInWord(word);
        }
        return totalSyllables;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static double calculateFleschKincaidScore(int words, int sentences, int syllables) {
        if (words == 0 || sentences == 0) {
            return 0.0; // Avoid division by zero
        }
        return 206.835 - (1.015 * (double) words / sentences) - (84.6 * (double) syllables / words);
    }

    private static String categorizeReadability(double score) {
        if (score >= 90) {
            return "Very Easy";
        } else if (score >= 80) {
            return "Easy";
        } else if (score >= 70) {
            return "Fairly Easy";
        } else if (score >= 60) {
            return "Standard";
        } else if (score >= 50) {
            return "Fairly Difficult";
        } else if (score >= 30) {
            return "Difficult";
        } else {
            return "Very Confusing";
        }
    }
}