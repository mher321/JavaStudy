package homework.util;

/**
 * This class contains utility methods for array
 * manipulation.
 */
public class ArrayUtil {

    /**
     * Sorts the util elements by odd and even number
     * such that if first number is odd then second must be even number
     * this means that it will be found the next even number and swap with the second element
     * if the second element is odd. And so on for the next elements of the util
     */
    public static void sortByOddAndEven(int[] array) {
//        TODO   implement
    }

    public static int getMaximum(int[] array) {
//        TODO   implement
        return 0;   // this must be replaced by correct code
    }


    public static int getMinimum(int[] array) {
//        TODO implement
        return 0;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;   // this must be replaced by correct code
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {
//        TODO implement
        return null;   // this must be replaced by correct code
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
//        TODO implement

    }

    /**
     * Swaps the elements at the specified positions in the specified array.
     * (If the specified positions are equal, invoking this method leaves
     * the array unchanged.)
     *
     * @param array The array in which to swap elements.
     * @param i     the index of one element to be swapped.
     * @param j     the index of the other element to be swapped.
     */

    public static void swap(int[] array, int i, int j) {
//       int miban = array[i];
//       int miban2 = array[j];
//       array[i] = miban2;
//       array[j] = miban;

        int n = array[i];

        array[i] = array[j];
        array[j] = n;
    }

    public static void print(int[] a) {
        print(a, " ");
    }

    /**
     * Prints all elements in an array by using specified delimiter between elements.
     *
     * @param a the util to print
     */
    public static void print(int[] a, String delimiter) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + delimiter);
        }
        System.out.print(a[a.length - 1]);
    }


    public static void print(int[][] a, String delimiter) {
        for (int i = 0; i < a.length ; i++) {
            print(a[i],delimiter);
            System.out.println();
        }
    }
}
      
