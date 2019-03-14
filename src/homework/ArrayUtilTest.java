package homework;

import homework.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        // todo : Organize all test methods calls here
        int array[] = {5, 4, 5, 8, 12, 24, 3, 7};

        int twoDimensionalArray[][] = {
                {5, 4, 5, 8, 12},
                {5, 6, 5, 8, 12},
                {5, 4, 7, 8, 12},
                {5, 4, 5, 9, 12},
                {5, 4, 5, 8, 16}
        };
        //   ArrayUtil.print(twoDimensionalArray," ");

        //   ArrayUtil.printDiagonal(twoDimensionalArray);
     //   ArrayUtil.printLessThanNumber(array, 6);





//        int twoDimensionalArray[][] = new int[3][2];
//        twoDimensionalArray[0][0] = 1;
//        twoDimensionalArray[0][1] = 2;
//        twoDimensionalArray[1][0] = 3;
//        twoDimensionalArray[1][1] = 4;
//        twoDimensionalArray[2][0] = 5;
//        twoDimensionalArray[2][1] = 6;


//        System.out.println(ArrayUtil.getSum(array));
//        ArrayUtil.print(twoDimensionalArray, " * ");




//       ArrayUtil.swap(array,5,1);
//       ArrayUtil.print(array, " */* ");

      ArrayUtil.print(array);
       ArrayUtil.reverseInSameArray(array);
       ArrayUtil.print(array);


//       ArrayUtil.print(array);

//       ArrayUtil.print(ArrayUtil.reverse(array));

//       ArrayUtil.print(array);

//       System.out.println(ArrayUtil.getMinimum(array));

//       int sum = ArrayUtil.getSum(array);
//       System.out.println(sum);
//       ArrayUtil.print(array)//  ArrayUtil.sortByOddAndEven(array);//ArrayUtil.print(array);
    }
}