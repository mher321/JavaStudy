package datatypes;
//Demonstrate do- while loop.
public class DwDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press a key Followed by Enter:  ");


            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}
