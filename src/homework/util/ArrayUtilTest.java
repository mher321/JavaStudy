package homework.util;

public class ArrayUtilTest {
    public static void main(String[] args) {
        // todo : Organize all test methods calls here
        int array[] = {5, 4, 5, 8, 12, 24};




        int twoDemencionalArray[][] = new int[3][2];
        twoDemencionalArray[0][0] = 1;
        twoDemencionalArray[0][1] = 2;
        twoDemencionalArray[1][0] = 3;
        twoDemencionalArray[1][1] = 4;
        twoDemencionalArray[2][0] = 5;
        twoDemencionalArray[2][1] = 6;


//        System.out.println(ArrayUtil.getSum(array));
       // ArrayUtil.print(twoDemencionalArray, " * ");




//     ArrayUtil.swap(array,0,1);
//     ArrayUtil.print(array, " */* ");

//     ArrayUtil.print(array);
//     ArrayUtil.reverseInSameArray(array);
//     ArrayUtil.print(array);


//     ArrayUtil.print(array);

//     ArrayUtil.print(ArrayUtil.reverse(array));

//        ArrayUtil.print(array);

//        System.out.println(ArrayUtil.getMinimum(array));

        int sum = ArrayUtil.getSum(array);
        System.out.println(sum);
    }
}