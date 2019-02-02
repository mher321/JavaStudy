package datatypes;
// The body of a loop can be empty.
public class Empty3 {
    public static void main(String[] args) {
        int i;
        int prod = 1;

        // sum the numbers through 5
        for (i = 1; i <= 9; prod *= i++);

        System.out.println("Sum i a: " + prod);
    }
}
