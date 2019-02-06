package auditorium;

/**
 * Draws the triangle by specified length number
 * for example when n = 4 , it must be such as
 * drawn below :
 *      *
 *      * *
 *      * * *
 *      * * * *
 *
 * @param length  specified length of triangle will be drawn
 */

public class FigurePrinter {
    public static void main(String[] args) {
        int n = 4;
        int i, j;

        // run loop n times
        for (i = 0; i <= n; i++) {

            for (j = 4; j >= 0; j--) {
                if (j < i)
                    System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

}
/*class Figureprinter2 {
    public static void main(String args[]) {
        // TODO : complete the method
        int n = 5;


            for (int i = 1; i < 10; i += 2) {
                for (int k = 0; k < (4 - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        // run loop n times

    }

*/

        /**
         * Draws the triangle by specified length number
         * for example when n = 4 , it must be such as
         * drawn below :
         *             *
         *           * *
         *         * * *
         *       * * * *
         *
         * @param length  specified length of triangle will be drawn
         */
/*        public static class Figureprint3 {
            public static void main(String[] args) {
                // TODO : complete the method
                for (int i=1; i<10; i += 2)
                {
                    for (int j=0; j<i; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
*/
        /**
         * Draws the triangle by specified length number
         * for example when n = 4 , it must be such as
         * drawn below :
         *
         *       * * * *
         *       * * *
         *       * *
         *       *
         *
         * @param length  specified length of triangle will be drawn
         */
     /*   public static void drawLeftBottomTriangle ( int length){
            // TODO : complete the method
        }
*/
        /**
         * Draws the triangle by specified length number
         * for example when n = 4 , it must be such as
         * drawn below :
         *
         *       * * * *
         *         * * *
         *           * *
         *             *
         *
         * @param length  specified length of triangle will be drawn
         */
        class Figureprint4 {
            public static void main(String[] args) {

                int n = 5;

                for (int i = 1; i <= n; i++) {
                    int j = 1;
                    for (; j <= i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (; j <= n; j++) {
                        System.out.print(" *");
                    }
                    System.out.print('\n');
                }
                System.out.print('\n');
            }

            /**
             * Draws the rhombus by specified length number
             * for example when n = 4 , it must be such as
             * drawn below :
             * <p>
             * *
             * * *
             * * * *
             * * * * *
             * * * *
             * * *
             * *
             *
             * @param length specified length of rhombus will be drawn
             */
            public static void drawRhombus(int length) {
                // TODO : complete the method
            }

            /**
             * Draws the rhombus by specified length number
             * for example when n = 4 , it must be such as
             * drawn below :
             * <p>
             * * * * *
             * *     *
             * *     *
             * * * * *
             *
             * @param width specified width of rectangle will be drawn
             */
            public static void drawEmptyRectangle(int width, int height) {
                drawEmptyRectangle(width, height, " *");
            }

            public static void drawEmptyRectangle(int width, int height, String printingSymbols) {
                printFullRow(width, printingSymbols);
                for (int i = 0; i < height - 2; i++) {
                    printEmptyRow(width, printingSymbols);
                }
                printFullRow(width, printingSymbols);

            }

            static void printEmptyRow(int length) {
                printEmptyRow(length, " *");
            }

            static void printEmptyRow(int length, String printingSymbols) {
                System.out.print(printingSymbols);
                int spacesCount = (length - 2) * printingSymbols.length();
                for (int i = 0; i < spacesCount; i++) {
                    System.out.print(' ');
                }
                System.out.print(printingSymbols + '\n');

            }

            static void printFullRow(int length) {
                printFullRow(length, " *");
            }

            static void printFullRow(int length, String printingSymbols) {
                for (int i = 0; i < length; i++) {
                    System.out.print(printingSymbols);
                }
                System.out.println();
            }
        }

     /*   public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightBottomTriangle(3);
//        drawRightBottomTriangle(4);
//        drawRightBottomTriangle(7);
             drawEmptyRectangle(7, 4, "@@");

         }


    }
    */