public class NewInstance {
    public int age;
    public String name;

    // Correct constructor
    public NewInstance() {
        name = "Saurav";
        age = 22;
    }

    public static void main(String[] args) {
        // Method 1: Using the 'new' keyword
        NewInstance stu = new NewInstance();
        stu.age = 30;
        stu.name = "Mansi";

        // Method 2: Using Reflection
        try {
            Class<?> c = Class.forName("NewInstance");
            NewInstance stu2 = (NewInstance) c.getDeclaredConstructor().newInstance();

            System.out.println("Using Reflection:");
            System.out.println("Name: " + stu2.name);
            System.out.println("Age: " + stu2.age);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Printing details of stu using Method 1
        System.out.println("Using new keyword:");
        System.out.println("Name: " + stu.name);
        System.out.println("Age: " + stu.age);
    }
}