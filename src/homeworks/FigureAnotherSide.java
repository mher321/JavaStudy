package homeworks;

public class FigureAnotherSide {
    public static void main(String[] args) {
        int n = 4;
        int i, j;

        // run loop n times
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= 5; j++) {
                if (j <= i)
                System.out.print("\t*");

            }
            System.out.println();
        }
    }
}
     /*       }
            // loop for printing '*'
            for (k = 1; k <= i; k++) {

                // move to the nex}t row
            }System.out.println("*");

        }System.out.println("\n");
    }
}
*/