package datatypes;
/* Compute the number of cubic inches
in 1 cubic mile.
 */

public class Chapter2Inches {
    public static void main (String args []){
        long ci;
        long im;

        im = 5280 * 12 ;
        ci = im * im * im;

        System.out.println("There are " + ci +  "  cubic inches in cubic mile.");

    }
}


/* Use the Pythagorean theorem to find the length of the
hypotenuse given the lengths of the two opposing sides
 */

class Hypot {
    public static void main (String args []){
        double x, y, z;

        x = 3 ;
        y = 4 ;

        z = Math.sqrt( x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}


class CharArithDemo {
    public static void main (String args []){

        char ch;

        ch = 'X';
        System.out.println ("ch contais " + ch);

        ch++ ; // increment ch
        System.out.println("ch is now " + ch);

        ch = 84; // give ch the value Z
        System.out.println("ch is now " + ch);

    }
}



//demonstrate a boolean values.
class BoolDemo {
    public static void main (String args []){
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement
        if(b) System.out.println("This is executed ");

        b = false;
        if(b) System.out.println("This is not executed ");

        //outcome of a relational operator is a boolean value
        System.out.println("10 < 9 is " + (10 < 9) );

    }
}


/* Try This 2-1
Compute the distance to a lightning
strike whose sound takes 7.2 seconds
to reach you
 */
class Sound {
    public static void main (String args[]){
        double dist;

        dist = 1100 * 7.2;

        System.out.println("The lightning is " + dist + " feet away. ");

    }
}

// Demonstrate escape sequences in string.

class StrDemo {
    public static void main (String args[]){
        System.out.println("datatypes.First line \nSecond line ");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

    }
}

// Demonstrate dynamic initialisation
class DynInit {
    public static void main (String args[]){
        double radius = 4, height = 5;

        // Dynamically initialise volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}

// Demonstrate block scope
class ScopeDemo {
    public static void main (String args[]){
        int x; //known to all code within main

        x = 10;
        if(x == 10) { //start new scope
            int y = 20; //known only this block

            //x and y both known here
            System.out.println("x and y: " + x + " " + y );
            x = y * 2;
        }
        // y = 100; // Error ! y not know here

        // x is still known here.
        System.out.println("x is " + x);
    }
}

// Demonstrate lifetime of variable
class VarInitDemo {
    public static void main (String args[]){
        int x;
        for (x = 0; x < 3; x++ ){
            int y = -1; //y is initialized time block entered
            System.out.println("y is: " + y); //this always prints -1
            y = 100;
            System.out.println("y is now: " + y);

        }
    }
}

/* This program attempts to declare a variable
in an inner scope white the same name as one
defined in an outer scope.
 */
class NestVar {
    public static void main (String args[]){
        int count;

        for(count = 0; count < 10; count= count + 1){
            System.out.println("This is count: " +  count);

            int countd; //illegal
            for(countd = 0; countd < 2 ; countd++)
                System.out.println("This program is ERROR!!!");
        }
    }
}



// Demonstrate the % operator
class ModDemo {
    public static void main(String args[]){
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;
        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println(" 10/3 == " + iresult + " " + irem);
        System.out.println(" 10.0/3.0 == " + dresult + " " + drem);
    }
}

// Demonstrate the relational and logical operators
class RellogOps {
    public static void main (String args[]){
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("this won`t execute");
        if (i > j) System.out.println("this won`t execute");
        if (i >= j) System.out.println("this won`t execute");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("this won`t execute");
        if (!(b1 & b2)) System.out.println("!(b1 & b2) is true ");
        if (b1 | b2) System.out.println("b1 | b2 is true");
        if (b1 ^ b2) System.out.println("b1 ^ b2 is true");

    }
}

// Demonstrate the short-circuit operators
class SCops {
    public static void main (String args[]){
        int n, d, q;

        n = 10;
        d = 2;

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0 ; // now set d to zero

        //Since d is zero, the second operand is not evaluated

        if(d != 0 && (n % d) == 0)
            System.out.println("is a factor of" + n);
        /* now try same thing without short-circuit operator
        This will cause divide-by-zero
         */
        if(d != 0 && (n % d) == 0)
            System.out.println("is a factor of" + n);


    }
}


// Side effects can be important
class SideEffect {
    public static void main (String args[]){
        int i;

        i = 0;

        /* Here i is still incremented even though
        the if statement fails.
         */
        if(false & (++i < 100))
            System.out.println("this won`t be displayed ");
        System.out.println("if statment executed: " + i); // displays 1

        /* in this case i is not incremented because
        the short-circuit operator skips the increment
         */
        if(false && (++i < 100))
            System.out.println("this won`t be displayed ");
        System.out.println("if statment executed: " + i); // still 1

    }
}


class LtoD {
    public static void main (String args[]){

        long L;
        float F;

        L = 1324564L;
        F = L;
        System.out.println(L + " " + F);
        for (double i = 0.1; i != 1 ; i += 0.1) {
            System.out.println(i);
        }
        System.out.println("end");
    }
}

// Demonstrate Casting.
class CastDemo {
    public static void main (String args []){

        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y);
        System.out.println("Integer outcome of x / y " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for x
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}

// Try this 2.2: a true table for the logical operators
class LogicalOpTable {
    public static void main (String args[]){

        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + "null");

        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + "null");

        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + "null");

        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + "null");


    }
}


// A promotion surprise
class PromDemo {
    public static void main (String args[]){

        byte b;
        int i;

        b = 10;
        i = b * b; // ok, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}


// Using a cast.
class UseCast {
    public static void main(String args[]) {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions :  " + (double) i / 3 );

            System.out.println();


        }
    }
}