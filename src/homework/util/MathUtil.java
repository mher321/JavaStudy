package homework.util;


public class MathUtil {
    public static void main(String[] args) {
        A a = new A();
        A.Ainner ai = a.new Ainner();
        System.out.println(A.o);
//        System.out.println(pow(2, 4));
//        System.out.println(abs(-58));
//
//        System.out.println(gcd(6, 28));
//
//        System.out.println(factorial(5));
//        printIntAsBinary(4);
//        System.out.println(reverse(2749));

//        System.out.println(pow(3,3));
//       System.out.println(sequenceOfFibonacci(3));
   //     System.out.println(powWithRecursion(3, 2));


    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(b);
            b = b * a;
        }
        return b;
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        int z = x % y;
        while (z != 0) {
            x = y;
            y = z;
            z = x % y;
        }
        return y;
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static void printIntAsBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >> i & 1);
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }


//    1 1 2 3 5 8 13
//    0 1 2 3 4 5 6

    /**
     * Returns the value of Fibonacci for the given index.
     *
     * @param index The index.
     * @return
     */
    public static int sequenceOfFibonacci(int index){
        if(index == 0 || index == 1) {
            return 1;
        }

         return  sequenceOfFibonacci(index - 1) + sequenceOfFibonacci(index - 2);

    }


    public static int powWithRecursion(int a, int n){
        if(n == 1){
            return a;
        }
//            A^3 = A^2 * A
        return powWithRecursion(a, n - 1) * a;
    }

    public static int factorialRec(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return factorialRec(n - 1) * n;
    }


}

class A {
    private int x = 1;
    static  int o = 1;
    A() {
        Ainner oo = new Ainner();
                oo.oo = 22;

    }

    class Ainner {
          private int oo = 333;
        Ainner(){
            x = 2;
            o = 12;
        }
    }
}