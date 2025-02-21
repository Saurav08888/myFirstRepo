public class DefaultValue {

        int a;
        float b;
        char c;
        String d;
        double e;
        long f;
        boolean g;
        short h;
        byte i;

        void display()
        {
            System.out.println("Default Values of DataTypes in Java: ");
            System.out.println();
            System.out.println("Deafult Value of int: "+a);
            System.out.println("Default Value of float: "+b);
            System.out.println("Default Value of char: "+(int)c);
            System.out.println("Default Value of String: "+d);
            System.out.println("Default Value of double: "+e);
            System.out.println("Default Value of long: "+f);
            System.out.println("Default Value of boolean: "+g);
            System.out.println("Default Value of short: "+h);
            System.out.println("Default Value of byte: "+i);
        }
    public static void main(String[] args) {
        
        DefaultValue obj=new DefaultValue();
        obj.display();
    }
    
}
