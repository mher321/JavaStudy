package auditorium;

public class ArrayUtil {

    public static void BubbleSort(int [] array) {
        for (int i = 1; i < array.length; i++){
            for (int j = 1; j < array.length; j++){

                if(array [j-1] > array[j])
                    //to do swap
                    swap(array, j-1, j);
            }
        }
    }

    private static void swap(int[] array,int i,int j){
        int t;
        t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void print(int [] array){
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] array = {2, 8, 4, 1, 6, 565, 0, 9, 11};
        print(array);
        BubbleSort(array);

        print(array);

    }
}

