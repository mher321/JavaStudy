package datatypes;
// Read a character from a keyboard
public class KbIn {
    public static void main (String args[])
            throws java.io.IOException {


            char ch;

            System.out.println("Press a key followed by ENTER: ");

            ch =(char) System.in.read(); // get a char

            System.out.println("Your key is: " + ch);
        }
    }

