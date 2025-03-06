import java.util.Scanner;
public class Saurav
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Student Name: ");
        String name=scanner.nextLine();
        System.out.print("Enter Registration number of student: ");
        long roll=scanner.nextLong();
        System.out.println("Fill Your Marks of each subjects: ");
        System.out.print("English: ");
        int english=scanner.nextInt();
        System.out.print("Hindi: ");
        int hindi=scanner.nextInt();
        System.out.print("Maths: ");
        int maths=scanner.nextInt();
        System.out.print("General Knowledge: ");
        int gk=scanner.nextInt();
        double marks=(english+hindi+maths+gk)/4;
        System.out.println();
        System.out.println();
        System.out.println("The Student Infoarmation is: ");
        System.out.println("Name of the Student: "+name);
        System.out.println("Student Registration number: "+roll);


        
        
        if(marks<40)
        {
            System.out.println("You are failed");
        }
        else if(marks<50 && marks>=40)
        {
            System.out.println("Grade: E");
        }
        else if(marks<60 && marks>=50)
        {
            System.out.println("Grade: D");
        }
        else if(marks<70 && marks>=60)
        {
            System.out.println("Grade: C");
        }
        else if(marks<80 && marks>=70)
        {
            System.out.println("Grade: B");
        }
        else if(marks<90 && marks>=80)
        {
            System.out.println("Grade: A");
        }
        else if(marks<101 && marks>=90)
        {
            System.out.println("Grade: A+");
        }
        else{
            System.out.println("Invalid marks");
        }

    }
}