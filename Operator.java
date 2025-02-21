//All Operators in java
class Operator
{
    public static void main (String[] args) 
    {
          
        // arithmetic operators 
        int a=6,b=5;
        System.out.println("Addition of a and b is: "+(a+b));
        System.out.println("Subtraction of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Remaindfer of a and b is: "+(a%b));
        System.out.print("");
        System.out.println("\n");

        //Unary operator
        System.out.println("Post Increment of A: "+(++a));
        System.out.println("Pre Increment of A: "+(a++));
        System.out.println("Post Decrement of B: "+(--b));
        System.out.println("Pre Decrement of B: "+(b--));
        System.out.print("");
        System.out.println("\n");

        //Assignmentt Operattoor

        System.out.println("Assignment of A: "+(a+=3));
        System.err.println("Assignment of B: "+(b+=1));
        System.out.println("Assignment of A: "+(a-=3));
        System.out.println("Assignment of B: "+(b-=1));
        System.out.print("");
        System.out.println("\n");

        //Relational Operator

        System.out.println("A is greater than B: "+(a>b));
        System.out.println("A is less than B: "+(a<b));
        System.out.println("A is equal to B: "+(a==b));
        System.out.println("A is not equal to B: "+(a!=b));
        System.out.print("");
        System.out.println("\n");

        //Logical Operator

        boolean c=true;
        boolean d=false;

        System.out.println("And Operator: "+(c && d));
        System.out.println("Or Operator: "+(c || d));
        System.out.println("Not Operator: "+(!c));
        System.out.print("");
        System.out.println("\n");

        //bitwise Operator

        int e=1110;
        int f=1010;
        System.out.println("AND Operator: "+(e&f));
        System.out.println("Or Oprator: "+(e|f));
        System.out.print("");
        System.out.println("\n");

        //Shift Operator

        System.out.println("A shit to  Less 1: "+(a<<1));
        System.out.println("A shift to  Greater 1: "+(a>>1));
        System.out.print("");
        System.out.println("\n");

        //type caste operator


        int y=6;
        float u=y;
        double i=u;
        System.out.println("After Type Caste is "+u);


         
        
        



    }
}

