package datatypes;

// Demonstrate dynamic initialisation
public class DynInit {
    public static void main (String args[]){
        double radius = 4, height = 5;

        // Dynamically initialise volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
