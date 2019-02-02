package datatypes;
// Read a character from a keyboard
public class Chapter3KbIn {
    public static void main (String args[])
            throws java.io.IOException {


            char ch;

            System.out.println("Press a key followed by ENTER: ");

            ch =(char) System.in.read(); // get a char

            System.out.println("Your key is: " + ch);
        }
    }

// Guess the letter game.
class Guess {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';
        for (int i = 0; i <= 3; i++) {
            System.out.println("I`m thinking of a letter between A and Z.  ");
            System.out.print("Can you guess it: ");

            ch = (char) System.in.read(); //read a char from a keyboard

            if (ch == answer) System.out.println(" ** Right!! ** ");
            else {
                System.out.println("no no no");
                if (ch < answer) System.out.println("too low ");
                else System.out.println("too high");

            }
        }
    }
}

// Demonstrate an if-else-if ladder
class Ladder {
    public static void main (String args[]){

        int x;

        for( x = 0; x < 6; x++ ){

            if( x == 1 )
                System.out.println("x is one ");
            else if (x == 2)
                System.out.println("x is two ");
            else if (x == 3)
                System.out.println("x is three ");
            else if (x == 4)
                System.out.println("x is four ");

            else
                System.out.println("x is not between 1 and 4 ");

        }
    }
}


// Demonstrate the switch
class SwitchDemo {
    public static void main(String args[]){
        int i;

        for (i = 0; i < 10; i++)
            switch (i){
                case 0:
                    System.out.println(" i is zero ");
                    break;
                case 1:
                    System.out.println(" i is one ");
                    break;
                case 2:
                    System.out.println(" i is two ");
                    break;
                case 3:
                    System.out.println(" i is three ");
                    break;
                case 4:
                    System.out.println(" i is four ");
                    break;
                default:
                    System.out.println(" i is five or more ");
        }
    }
}


// Demonstrate the switch without break statements.
class NoBreak {
    public static void main (String args[]) {
        int i;

        for(i = 0; i <= 5; i++)
        {
            switch (i) {
                case 0:
                    System.out.println("i is less then one");
                case 1:
                    System.out.println("i is less then two");
                case 2:
                    System.out.println("i is less then three");
                case 3:
                    System.out.println("i is less then four");
                case 4:
                    System.out.println("i is less then five");
            }
            System.out.println( );
        }
    }
}


/* Try this 3-1
A simple Help system.
 */
class Help {
    void helpon(int what) {

        switch (what) {
            case 1:
                System.out.println("The if: \n");
                System.out.println("if (condition) statement: ");
                System.out.println("else statement");
                break;

            case 2:
                System.out.println("The switch : \n");
                System.out.println("Switch (expression) {");
                System.out.println("    case constant ");
                System.out.println("    statement sequence ");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("   }");
                break;
            case 3:
                System.out.println("The for:\n");
                System.out.println("for (int,condition,iteration): ");
                System.out.println("statement ");
                break;
            case 4:
                System.out.println("The while:\n ");
                System.out.println("while (condition) statement:");
                break;
            case 5:
                System.out.println("The do-while: \n");
                System.out.println("do { ");
                System.out.println("  statement;");
                System.out.println("} while (condition)");
                break;
            case 6:
                System.out.println("The break \n");
                System.out.println("break or break label");
                break;
            case 7:
                System.out.println("The continue \n");
                System.out.println("continue: or continue label");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.println("Help on:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    7. continue \n");
        System.out.println("CHoose one(q to quit) ");
    }

    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}


// show square roots  of 1 to 99 and rounding error.
class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + "is " + sroot);

            // compute rounding error.

            rerr = num - (sroot * sroot);
            System.out.println("Roundig error is " + rerr);
            System.out.println();
        }
    }
}


class DecrFor {
    public static void main(String[] args) {

        int x;

        for(x = 100; x > -100; x -= 5) {
            System.out.println(x);

        }
    }
}


// Use commas in a for statement
class Comma {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++ , j--){
            System.out.println("i " + i + " and j " + j);
        }
    }
}

// Loop until press M.
class ForTest {
    public static void main(String[] args) throws java.io.IOException {
        int i;
        System.out.println("Press M to stop:");

        for(i = 0; (char) System.in.read() != 'M' ; i++ )
            System.out.println("Pass # " + i);
    }
}


// Parts of the for can be empty.
class Empty {
    public static void main(String[] args) {
        int i;

        for( i = 4; i < 14;){
            System.out.println("Pass # " + i);
            i++;
        }
    }
}


// The body of a loop can be empty.
class Empty3 {
    public static void main(String[] args) {
        int i;
        int prod = 1;

        // sum the numbers through 5
        for (i = 1; i <= 9; prod *= i++);

        System.out.println("Sum i a: " + prod);
    }
}

// Declare loop control variable the for.
class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5

        for (int i = 1; i <= 5; i++ ){
            sum += i;
            fact *=  i;

            System.out.println("Sum is a: " + sum);
            System.out.println("Factorial is - " + fact);
        }
    }
}


//Compute integer power to 2
class Power {
    public static void main(String[] args) {
        int e;
        int result;

        for (int i = 0; i < 10; i++){
//            System.out.println(" 2 ^ " + i + " = " + result);
            result = 1;
            e = i;

            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println(" 2 to the " + i + " power is " + result);
        }
    }
}

class Helpfortest {
    public static void main(String[] args) throws java.io.IOException {
        char choise, ignore;

        do {
            System.out.println("Help on:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. for");
            System.out.println("    4. while");
            System.out.println("    5. do-while");
            System.out.println("CHoose one ");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');
        }while (choise < '1' | choise > '5');
    }
}


//Demonstrate do- while loop.
class DwDemo {
    public static void main(String[] args) throws java.io.IOException {
        char ch;

        do {
            System.out.println("Press a key Followed by Enter:  ");


            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}


class Guess4 {
    public static void main(String[] args) throws java.io.IOException {

        char ch, ignore, answere = 'K';

        do {
            System.out.println(" I am thinking of a letter between A and Z:");
            System.out.println(" Can you guess it :");

            //read characters
            ch = (char) System.in.read();

            // discard any other other characters in the input bufferl
//            do {
//
//                ignore = (char) System.in.read();
//
//            } while (ignore != '\n');
            int v = ch + ch ;
            if (ch == answere) {
                System.out.println("Right ...!!!!");
            } else {
                System.out.println("Sorry.. Sorry");
                if (ch < answere) {
                    System.out.println("too low");
                } else {
                    System.out.println("loo high");
                }
                System.out.println("Try again \n");
            }

        } while (answere != ch) ;
    }
}


class Help2 {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;

        do {
            System.out.println("Help on:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. for");
            System.out.println("    4. while");
            System.out.println("    5. do-while");
            System.out.println("CHoose one ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();

            }while (ignore != '\n');
        }while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice) {
            case 1:
                System.out.println("The if: \n");
                System.out.println("if (condition) statement: ");
                System.out.println("else statement");
                break;

            case 2:
                System.out.println("The switch : \n");
                System.out.println("Switch (expression) {");
                System.out.println("    case constant ");
                System.out.println("    statement sequence ");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println( "   }");
                break;
            case 3:
                System.out.println("The for:\n");
                System.out.println("for (int,condition,iteration): ");
                System.out.println("statement ");
                break;
            case 4:
                System.out.println("The while:\n ");
                System.out.println("while (condition) statement:");
                break;
            case 5:
                System.out.println("The do-while: \n");
                System.out.println("do { ");
                System.out.println("  statement;");
                System.out.println("} while (condition)");
                break;
        }
    }
}


class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;
        // loop while i-squared is less than num
        for (int i = 0; i < num; i++){
            if(i*i >= num) break;
            System.out.print( i + " ");
        }System.out.println("Loop complete:");
    }
}

// using break with label.
class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\n i is " + i);

                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        // this is never reached.
                        System.out.println("won`t print");

                    }
                    System.out.println("After block three. ");
                }
                System.out.println("After block two. ");
            }
            System.out.println("After block one. ");
        }
        System.out.println("After for. ");
    }
}

// Another example of using break with a label.
class Break5 {
    public static void main(String[] args) {
        done:
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    System.out.println(k + " ");
                    if(k == 5) break done; // jump to done

                }
                System.out.println(" After k loop. "); //won`t execute
            }
            System.out.println(" After j loop. ");// won`n execute
        }
        System.out.println(" After i loop ");
    }
}


// where you put a label is important
class Break6 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        // here you put label before for statement
        stop1:
        for (x = 0; x < 5; x++){
            for(y = 0; y < 5; y++){
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        // now put a label immediately before
        for (x = 0; x < 5; x++ )
            stop2: {
                for (y = 0; y < 5; y++){
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);

                }
            }
    }
}

class ContDemo {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 100; i++){
            if ((i%2) != 0)continue;
            System.out.println(i);

        }
    }
}

// use continue with a label.
class ConToLabel {
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i ++){
            System.out.print("\nOuter loop pass " + i + ", Inner loop.");
            for (int j = 1; j < 10; j++ ){
                if (j == 5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}


class Help3 {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;
        for (;;){

            do {
                System.out.println("Help on:");
                System.out.println("    1. if");
                System.out.println("    2. switch");
                System.out.println("    3. for");
                System.out.println("    4. while");
                System.out.println("    5. do-while");
                System.out.println("    6. break");
                System.out.println("    7. continue \n");
                System.out.println("CHoose one(q to quit) ");

                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();

                }while (ignore != '\n');
            }while (choice < '1' | choice > '7' & choice != 'q' );

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case 1:
                    System.out.println("The if: \n");
                    System.out.println("if (condition) statement: ");
                    System.out.println("else statement");
                    break;

                case 2:
                    System.out.println("The switch : \n");
                    System.out.println("Switch (expression) {");
                    System.out.println("    case constant ");
                    System.out.println("    statement sequence ");
                    System.out.println("    break;");
                    System.out.println("  // ...");
                    System.out.println("   }");
                    break;
                case 3:
                    System.out.println("The for:\n");
                    System.out.println("for (int,condition,iteration): ");
                    System.out.println("statement ");
                    break;
                case 4:
                    System.out.println("The while:\n ");
                    System.out.println("while (condition) statement:");
                    break;
                case 5:
                    System.out.println("The do-while: \n");
                    System.out.println("do { ");
                    System.out.println("  statement;");
                    System.out.println("} while (condition)");
                    break;
                case 6:
                    System.out.println("The break \n");
                    System.out.println("break or break label");
                    break;
                case 7:
                    System.out.println("The continue \n");
                    System.out.println("continue: or continue label");
                    break;

            }
            System.out.println();
        }

    }
}


class FindFac {
    public static void main(String[] args) {
        int i;
        for (i=2; i<=50; i++){
            System.out.print("Factors of " + i + ":");
            for (int j = 4; j < i; j++)
                if ((i%j) == 0)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}