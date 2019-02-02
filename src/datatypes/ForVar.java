package datatypes;
// Declare loop control variable the for.
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5

        for (int i = 1; i <= 5; i++ ){
            sum += i;
            fact *=  i;

            System.out.println("Sum is a: " + sum);
            System.out.println("Factorial is - " + fact);
        }
    }
}
