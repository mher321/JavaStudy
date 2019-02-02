package datatypes;
// show square roots  of 1 to 99 and rounding error.
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + "is " + sroot);

            // compute rounding error.

            rerr = num - (sroot * sroot);
            System.out.println("Roundig error is " + rerr);
            System.out.println();
        }
    }
}
