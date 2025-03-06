import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {

    public static List<int[]> mergeIntervals(int[][] intervals) {
        // If there are no intervals, return an empty list
        if (intervals.length == 0) {
            return new ArrayList<>();
        }

        // Sort the intervals based on the starting times
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval overlaps with the next interval
            if (currentInterval[1] >= intervals[i][0]) {
                // Merge the intervals by updating the end time
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // No overlap, add the current interval to the merged list
                merged.add(currentInterval);
                currentInterval = intervals[i]; // Move to the next interval
            }
        }

        // Add the last interval
        merged.add(currentInterval);

        return merged;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of intervals
        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();
        
        int[][] intervals = new int[n][2];
        
        // Input the intervals
        System.out.println("Enter the intervals (start and end):");
        for (int i = 0; i < n; i++) {
            System.out.print("Interval " + (i + 1) + ": ");
            intervals[i][0] = scanner.nextInt(); // Start
            intervals[i][1] = scanner.nextInt(); // End
        }
        
        // Merge the intervals
        List<int[]> mergedIntervals = mergeIntervals(intervals);
        
        // Output the merged intervals
        System.out.println("Merged intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
        
        scanner.close();
    }
}