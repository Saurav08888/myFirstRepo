public class Decentralized {
    public String name;

    // Constructor
    public Decentralized(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Static method to create an object
    public static Decentralized decentralized(String name) {
        // Here you can add logic to create the object in a decentralized manner
        return new Decentralized(name);
    }

    public static void main(String[] args) {
        // Create an object using the decentralized method
        Decentralized obj = Decentralized.decentralized("Anuj Mehla");
        System.out.println("JAVA Teacher name: " + obj.getName());
    }
}