package datatypes;

import java.awt.*;

// Demonstrate the bubble sort.
public class Chapter5Bubble {
    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10; // nuber of elements to sort.

        //display original array.
        System.out.print("Original array is: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //This is the bubble sort.
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { //if out of order
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        //display sorted array
        System.out.print("Sorted array is: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}


// Manually allocate differing size second dimensions.
class Ragged {
    public static void main(String[] args) {
        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j;

        //fabricate some face date.


        for (i = 0; i < 5; i++)
            for (j = 0; j < 10; j++)
                riders[i][j] = i + j + 10;
        for (i = 5; i < 7; i++)
            for (j = 0; j < 2; j++)
                riders[i][j] = i + j + 10;
        System.out.println("Riders per trip during the week:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Riders per trip during the weekend");
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(riders[i][j] + " ");
            System.out.println();
        }
    }
}

// Assigning array reference variables.
class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i=0; i < 10; i++)
            nums1[i] = i;

        for (i=0; i < 10; i++)
            nums2[i] = -i;
        System.out.print("Here is nums1: ");
        for (i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here in nums2: ");
        for (i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; // now nums2 refers to nums1.

        System.out.print("Here is nums2 after assignment: ");
        for (i=0; i < 10;i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        //now operate on nums1 array through nums2.
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2: ");
        for (i=0; i < 10; i++)
            System.out.print(nums1[i] +  " ");
        System.out.println();

    }
}

// Use the length array member.
class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[] [] = { // a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        System.out.println("length of list is  " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("length of table is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        System.out.println();

        // use length to initialize list
        for (int i=0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("Here is list: ");
        // now use length to display list
        for (int i=0; i < list.length; i++ )
            System.out.print(list[i] + " ");
        System.out.println();

    }
}

//Use length variable to help copy an array.
class ACopy{
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i=0; i <nums1.length; i++)
            nums1[i] = i;
        //copy nums1 to nums2
        if (nums2.length >= nums1.length)
            for (i=0; i < nums1.length; i++)
                nums2[i] = nums1[i];

            for (i=0; i < nums2.length; i++)
                System.out.println(nums2[i] + " ");
    }
}

/*
Try This 5-2

A queue class for characters
 */
class Queue{
    char q[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size){
        q = new char[size]; // allocate memory for queue
        putloc = getloc = 0;
    }
// put a character into the queue

    void put(char ch){
        if (putloc == q.length) {
            System.out.println(" -Queue is full. ");
            return;
        }
        q[putloc++] = ch;
    }
// get a character from the queue
char get() {
        if(getloc == putloc){
            System.out.println(" - Queue is empty. ");
            return (char) 0;
        }
        return q[getloc++];
    }
}

// Demonstrate the Queue class.

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using the bigQ to store the alphabet. ");
        // put some numbers into bigQ

        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display elements from bigQ.
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0)
                System.out.print(ch);
        }
        System.out.println(" \n ");

        System.out.println("Using smallQ to generate errors. ");
        // Now, use smallQ to generate some errors.
        for (i=0; i < 5; i++){
            System.out.print("Attemping to store " + (char) ('Z' - i) );

            System.out.println();
        }
        System.out.println();

        // more errors in smallQ
        System.out.print("Contents of smallQ: ");
        for (i=0; i < 5; i++){
            ch = smallQ.get();

            if (ch != (char) 0)
                System.out.print(ch);
        }

    }
}

// Use a for-each style for loop
class ForEach{
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for (int x: nums) {
            System.out.println("Value is: " + x );
            sum += x;
        }
        System.out.println("Summation : " + sum);
    }
}

// Use for-each style for on a two-dimensional array.
class ForEach2{
    public static void main(String[] args) {
        int sum = 0;
        int nums [][] = new int[3][5];

        //give nums some values
        for (int i=0; i < 5; i++)
            for (int j=0; j < 3; j++)
                nums[i][j] = (i+1)*(j+1);

            // Use for-each for loop display and sum the values
        for (int x[]: nums){
            for (int y : x){
                System.out.println("Value is: " + y);
                sum += y;

            }
        }
        System.out.println("Summation: " + sum);
    }
}

// Search an array using for-each style for.
class Search{
    public static void main(String[] args) {
        int nums[] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        // Use for-each for to search nums for val.
        for (int x: nums){
            if (x == val){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found.");
    }
}

//Some string operations.

class StrOps{
    public static void main(String[] args) {
        String str1 = "When it comes to programing, Java is #1. ";
        String str2 = (str1);
        String str3 = "Java strings are powerful. ";
        int result, idx;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        // display str1,one char at a time.
        for (int i=0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();
        if (str1.equals(str2))
            System.out.println("str1 equals str2 ");
        else
            System.out.println("str1 does not equal str2 ");
        if (str1.equals(str3))
            System.out.println("str1 equal str3 ");
        else
            System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println("str1 and str3 are equal ");
        else if(result < 0)
            System.out.println("str 3 less than str 1");
        else
            System.out.println("str1 is greater than str3");

        //assign a new string to str2
        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("Index of first occurrence of One:  " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of first occurrence of One: " + idx);
    }
}

//Demonstrate string arrays.
class StringArrays {
    public static void main(String[] args) {
        String strs[] = {"This","is","a","test"};

        System.out.println("Original array: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // change a string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for (String s: strs)
            System.out.print(s + " ");

    }
}

// Use substring().
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        //construct a substring
        String substr = orgstr.substring(5,18);

        System.out.println("orgstr. " + orgstr);
        System.out.println("substr: " + substr);
    }
}

//Display all command line information.
class ClDemo{
    public static void main(String args[]) {
        System.out.println("There are " + args.length + "the command line arguments");
        System.out.println("They are:");
        for (int i=0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}

//A simple automated phone directory.
class Phone {
    public static void main(String[] args) {
        String numers [] [] = {
                {"Gag", "099229916"},
                {"Hayk", "091740020"},
                {"Axper", "055036666"}

        };

        int i;

        if(args.length != 1)
            System.out.println("Usage: java Phone <name>");
        else {
            for (i=0; i < numers.length; i++){
                if(numers[i][0].equals(args[0])){
                    System.out.println(numers[i][0] + ": " + numers[i][1]);
                    break;
                }
            }
            if (i == numers.length)
                System.out.println("Name not found. ");
        }
    }
}

// Uppercase letters.
class UpCase{
    public static void main(String[] args) {
        char ch;

        for (int i=0; i < 20; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            // This statement turns of the 6th bit.
            ch = (char) ((int) ch & 65503); //ch is now uppercase

            System.out.print(ch + " ");

        }
    }
}

// Display the bits within a byte.
class ShowBits{
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t=128; t > 0; t = t/2){
            if ((val & t) !=0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}

//Lowercase letters
class LowCase{
    public static void main(String[] args) {
        char ch;

        for (int i=0; i < 10; i++){
            ch = (char) ('C' + i);
            System.out.print(ch);

            //This statement turns on 6th bit.
            ch = (char) ((int) ch | 32); //ch is now lowercase

            System.out.print(ch + " ");
        }
    }
}

//Use XOR to encode and decode a massage.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original massage: ");
        System.out.println(msg);

        //encode the massage
        for (int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded massage: " );
        System.out.println(encmsg);


        //decode the massage
        for (int i = 0; i < msg.length(); i++)
            decmsg = decmsg + (char)(encmsg.charAt(i) ^ key);

        System.out.print("Decoded massage: ");
        System.out.println(decmsg);

    }
}

class NotDemo{
    public static void main(String[] args) {
        byte b = -34;
        for (int t = 128; t > 0; t = t/2){
            if ((b & t) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
        System.out.println();

        //revers all bits
        b =(byte) ~b;

        for (int t=128; t > 0; t = t/2){
            if ((b & t) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}

//Demonstrate the shift << and >> operators.
class ShiftDemo{
    public static void main(String[] args) {
        int val = 1;

        for (int i = 0; i < 8; i++){
            for (int t = 128; t > 0; t = t/2){
                if((val & t) !=0 )
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
            val = val << 1;
        }

        val = 128;

        for (int i = 0; i < 8; i++){
            for(int t = 128; t > 0; t = t/2){
                if ((val & t) != 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
            val = val >> 1; // right shift.
        }

    }
}

