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

        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 != 0) {
                System.out.println(array);
            }
        }
    }



    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if (min > array[i]){
                min = array[i];
            }

        }
        return min;   // this must be replaced by correct code
    }

    /**
     * Calculates the sum of specified <code>array</code>  elements
     *
     * @param array specified int array
     * @return the sum of the specified util elements
     */
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        return sum;
    }


    /**
     * Creates the reversed to specified array new array and returns it.
     *
     * @param array an array corresponding to which must be created reversed array
     * @return new created reversed array to the specified parameter "array"
     */
    public static int[] reverse(int[] array) {
        int [] result = new int[array.length];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length ; i++) {
            result [i] =  array[lastIndex - i];

        }
        return result;   // this must be replaced by correct code
    }

    /**
     * Reverses the elements order of the specified array
     *
     * @param array an array: Elements order of wich must be reversed
     */
    public static void reverseInSameArray(int[] array) {
        for (int i = 0; i < array.length / 2 ; i++) {
            swap(array, i , array.length - i -1);

            }
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
        System.out.println();
    }

    public static void print(int[][] a, String delimiter) {
        for (int i = 0; i < a.length; i++) {
            print(a[i], delimiter);
            System.out.println();
        }
    }
}