package datatypes;

public class Figure4 {
    public static void main(String[] args) {
        int n = 4;
        int i, j;

        // run loop n times
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= 4; j++) {
                if (j >= i)
                    System.out.print("\t*");

            }
            System.out.println();
        }
    }
}
