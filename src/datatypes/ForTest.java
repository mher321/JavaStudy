package datatypes;
// Loop until press M.
public class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("Press M to stop:");

        for(i = 0; (char) System.in.read() != 'M' ; i++ )
        System.out.println("Pass # " + i);
    }
}
