package datatypes;

// A promotion surprise
public class PromDemo {
    public static void main (String args[]){

        byte b;
        int i;

        b = 10;
        i = b * b; // ok, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);


    }
}
