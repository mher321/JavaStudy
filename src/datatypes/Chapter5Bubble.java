package datatypes;
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
    int putloc, getloc; // the pu and get indices

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