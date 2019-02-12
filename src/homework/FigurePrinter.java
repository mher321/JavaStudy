package homework;


public class FigurePrinter {

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
    public static void drawLeftUpTriangle(int length){
        // TODO : complete the method
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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length){
        // TODO : complete the method
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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length){
        // TODO : complete the method
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
     * @param length  specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length){
        for (int i = 1; i <=  length; i++) {
            int j = 1;
            for ( ; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (; j <= length; j++) {
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
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * @param length  specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length){

            // run loop n times
            for (int i = 1; i <= length; i++) {

                int j = 1;
                for (; j <= length - i; j++) {
                    System.out.print(" ");
                }
                for (; j <= length; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (int i = 1; i < length; i++) {
                int j = 1;
                for (; j <= i; j++){
                    System.out.print(" ");
                }
                for (; j <= length ; j++)
                    System.out.print(" *");
                System.out.println();
            }

    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     *
     *     * * * *
     *     *     *
     *     *     *
     *     * * * *
     *
     * @param width  specified width of rectangle will be drawn
     */
    public static void drawEmptyRectangle(int width, int height){
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height , String printingSymbols){
        printFullRow(width, printingSymbols);
        for (int i = 0; i < height - 2; i++) {
            printEmptyRow( width,printingSymbols);
        }
        printFullRow(width,printingSymbols);

    }

    static  void  printEmptyRow(int length){
        printEmptyRow(length, " *");
    }

     static  void  printEmptyRow(int length, String printingSymbols){
         System.out.print(printingSymbols);
         int spacesCount = (length - 2) * printingSymbols.length();
         for (int i = 0; i < spacesCount; i++) {
             System.out.print(' ');
         }
         System.out.print(printingSymbols + '\n');

    }

    static void printFullRow(int length){
        printFullRow(length, " *");
    }

    static void printFullRow(int length, String printingSymbols){
        for (int i = 0; i < length; i++) {
            System.out.print(printingSymbols);
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        drawLeftUpTriangle(10);
//        drawRightBottomTriangle(3);
  //      drawRightBottomTriangle(4);
//        drawRightBottomTriangle(7);
        drawEmptyRectangle(7, 4, "*");
 //       drawRhombus(7);

    }


}
