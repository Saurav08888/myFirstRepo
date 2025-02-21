/*
 * Write a program that averages the synsets created for three months April, May and June. Declare and initialize variable to the synset entered for each month.
Compute the average and write out the results, something like this:
Synsets Entered for April: 12
Synsets Entered for May: 14
Synsets Entered for June: 8
Average Synset Entered: 11.333333
 */


public class Average {
    public static void main(String[] args) {

        int april=12, may=14, june=8;
        double average;
        double total=april+may+june;
        average=total/3;

        System.out.println("Synsets Entered for April: "+april);
        System.out.println("Synsets Entered for May: "+may);
        System.out.println("Synsets Entered for June: "+june);
        System.out.println("Average Synset Entered: "+average);
        
    }
}
