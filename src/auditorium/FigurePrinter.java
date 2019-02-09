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
 */

public class FigurePrinter {
    public static void main(String[] args) {
        int i, j;

        // run loop n times
        for (i = 0; i <= 4; i++) {

            for (j = 4; j >= 0; j--) {
                if (j < i)
                    System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}

/**
 * Draws the triangle by specified length number
 * for example when n = 4 , it must be such as
 * drawn below :
 *             *
 *           * *
 *         * * *
 *       * * * *
 *
 */

class Figureprinter2 {
    public static void main(String args[]) {
        // TODO : complete the method


        for (int i = 0; i < 5; i++) {
           for (int k = 0; k < (5 - i); k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
           }
        }
}


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
 */

        class Figureprint3 {
            public static void main(String[] args) {
                // TODO : complete the method
                for (int i=1; i<=4; i++) {

                    for (int j=1; j<=3; j++) {
                        if(j>=i)
                        System.out.print(" *");
                    }System.out.println(" *");
                }
            }
        }


        class DrawLeftBottomTriangle {
            public static void drawLeftBottomTriangle(int length) {
                // TODO : complete the method
            }
        }

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
         */
        class Figureprint4 {
            public static void main(String[] args) {
                for (int i = 0; i <= 4; i++) {

                    for (int j = 4; j >= 0; j--) {
                        if (j > i)
                            System.out.print(" *");
                    }
                    System.out.println(" ");
                }
            }
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
             */
            class DrawRhombus {
                public static void main (String args[]) {
                    // TODO : complete the method

                    // run loop n times
                    for (int i = 0; i <= 5; i++) {

                        for (int j = 5; j >= 0; j--) {
                            if (j < i)
                                System.out.print(" *");
                        }
                        System.out.println(" ");
                    }
                    for (int i = 0; i <= 4; i++) {

                        for (int j = 4; j >= 0; j--) {
                            if (j > i)
                                System.out.print(" *");
                        }
                        System.out.println(" ");
                    }

                }

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
             */
            class DrawEmtyRectangle {
                public static void  drawEmptyRectangle(int width, int height) {
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


        public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightBottomTriangle(3);
//        drawRightBottomTriangle(4);
//        drawRightBottomTriangle(7);
             drawEmptyRectangle(7, 4, "@@");

         }


    }