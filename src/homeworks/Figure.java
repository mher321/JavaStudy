package homeworks;

public class Figure {
    public static void main(String[] args) {
        int n = 5;
        int i, j, k;

        // run loop n times
        for (i = 1; i <= n; i++) {
            // loop for printing space
            for (j = 1; j <= n + i; j++)
                System.out.print(" ");

            // loop for printing '*'
            for (k = 1; k <= n - i; k++)
                System.out.print("*");

            // move to the next row
            System.out.println("\n");
        }
    }
    }