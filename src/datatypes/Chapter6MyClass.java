package datatypes;
// Public vs  private access
public class Chapter6MyClass {
    private int alpha; // private access
    public int beta; // public access
    int gamma; // default access

    /* Methods to access alpha. It is ok for a
    member of a class to access a private member
    of the same class
     */
    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}

class AccessDEmo {
    public static void main(String[] args) {
        Chapter6MyClass ob = new Chapter6MyClass();

        /* Access to alpha is allowed only through
        its accessor methods
         */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is: " + ob.getAlpha());

        //you cannot access alpha like this.
        //ob.alpha = 10; //Wrong! alpha is private

        // These are ok because beta and gamma are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}

/* This class implements a "fail-soft" array which prevents
runtime errors.
 */
class FailSoftArray {
    private int a[]; // reference to array
    private int errval; // value to return if get() fails
    public int lenght; //lenght is public

    /* Construct array given its size and the value to
    return if get() fails.  */
    public FailSoftArray (int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;
    }
    //Return value at given index
    public int get(int index){
        if (indexOK(index))return a[index];
        return errval;
    }

    // put a value at an index. Return false on failure.
    public boolean put(int index,int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // Return true if index is written bounds.
    private boolean indexOK(int index){
        if (index >= 0 & index < lenght)
            return true;
        return false;
    }
}

//Demonstrate the fail soft array.
class FSDemo{
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //show quiet failures
        System.out.println("Fail quietly ");
        for (int i = 0; i < (fs.lenght * 2); i++)
            fs.put(i, i *10);

        for (int i = 0; i < (fs.lenght * 2); i++){
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
        }
        System.out.println("");

        //now, handle failures
        System.out.println("\n Fail with error reports ");
        for (int i = 0; i < (fs.lenght * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds ");
        for (int i = 0; i < (fs.lenght * 2); i++) {
            x = fs.get(i);
            if (x != -1)
                System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds ");

        }
    }
}

// Objects can be passed to methods
class Block{
    int a,b,c;
    int volume;

    Block(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    //Return true if ob defines same block
    boolean sameBlock(Block ob){
        if ((ob.a == a)&(ob.b == b)&(ob.c == c))
            return true;
        else
            return false;
    }
    //Return true if ob has same volume.
    boolean sameVolume(Block ob){
        if(ob.volume == volume)
            return true;
        else
            return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(4,5,5);

        System.out.println("ob1 has same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 has same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 has same volume as ob3: " + ob1.sameVolume(ob3));
    }
}

//Primitive tips are passed by value
class Test{

    /* This method causes no change to the arguments
    used in the call.
     */
    void noChange (int i, int j){

        i = i + j;
        j = -j;
    }
}

class CallByValue{
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.noChange(a,b);

        System.out.println("a and b after call: " + a + " " + b);

    }
}

// Objects are passed through their references.
class Test1{
    int a, b;

    Test1 (int i, int j){
        a = i;
        b = j;
    }
    /* Pass an object. Now ob.a and ob.b in object
    used in the call will be changed
     */
    void Change(Test1 ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class PassObRef{
    public static void main(String[] args) {
        Test1 ob = new Test1(15, 20);

        System.out.println("a and b before call: " + ob.a + " " + ob.b);

        ob.Change(ob);

        System.out.println("a and b after call: " + ob.a + " " + ob.b);

    }
}

// Return a string object
class ErrorMsg{
    String msgs[] = {
            "Output error", "Input error", "Disc full", "Index out-of-bounds"
    };

    //Return the error massage
    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length )
            return msgs[i];
        else
            return "Invalid error code";
    }
}

class ErrMsg{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}

//Return a programmer-defined object.
class Err{
    String msg; //error massage
    int severity; // code indicating severity

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Output error", "Input error", "Disc full", "Index out-of-bounds"
    };
    int howbod[] = {3, 3, 2, 4};

    Err getErrorInfo ( int i) {
        if( i >= 0 & i < msgs.length )
            return new Err(msgs[i], howbod [i]);
        else
            return new Err("Invalid Error code", 0);
    }
}

class ErrInfo{
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + "severity :  " + e.severity );

        e = err.getErrorInfo(19);
        System.out.println(e.msg + "severity : " + e.severity);
    }
}

// Demonstrate method overloading
class Overload{
    void ovlDemo(){
        System.out.println("No Parameters");
    }

    // Overload ovlDemo for one integer parameter.
    void ovlDemo (int a){
        System.out.println("One parameter " + a);
    }

    //Overload ovlDemo for two integer parameters
    int ovlDemo(int a, int b){
        System.out.println("two parameters " + a + " " + b);
        return a + b;
    }
//Overload ovlDemo for two double parameters
    double ovlDemo(double a, double b){
        System.out.println("two parameters double" + a + " " + b );

        return a + b;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // Call all versions of ovlDemo.
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4,6) " + resI);

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of double: " + resD);
    }
}

/*Automatic type conversions can affect
overloaded method resolution
 */
class Overload2{
    void f(int x){
        System.out.println("Inside f(int) " + x);
    }

    void f (double x){
        System.out.println("Inside f (double) " + x);
    }
}

class TypeConv{
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5f;

        ob.f(i); //calls ob.f(int)
        ob.f(d); //calls ob.d(double)

        ob.f(b); //calls ob.f(int) - type conversion
        ob.f(s); //calls ob.f(int) - type conversion
        ob.f(f); //calls ob.f(double) - type conversion
    }
}

// Demonstrate an overloading constructor
class MyClass{
    int x;

    MyClass(){
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass(int i){
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    MyClass(double d){
        System.out.println("Inside MyClass(double).");
        x = (int)d;
    }

    MyClass(int i, int j){
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}

class OverLoadConsDemo{
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2,4);

        System.out.println("t1.x : " + t1.x);
        System.out.println("t2.x : " + t2.x);
        System.out.println("t3.x : " + t3.x);
        System.out.println("t4.x : " + t4.x);
    }
}

// Initialise one object with another
class Summation{
    int sum;

    //Construct from an int
    Summation(int num){
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    //Construct from another object
    Summation(Summation ob){
        sum = ob.sum;
    }
}

class SumDemo{
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}

// A simple example of recursion
class Factorial{
    //This is a recursive function
    int factR(int n){
        int result;
        if(n == 1) return 1;
        result = factR(n-1) * n;
        return result;
    }
    //This is an interactive equivalent
    int factI(int n){
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++)
            result *= t;
        return result;
    }
}

class Recursion{
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method. ");
        System.out.println("Factorial of 3 is : " + f.factR(3));
        System.out.println("Factorial of 3 is : " + f.factR(4));
        System.out.println("Factorial of 3 is : " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using an interactive method. ");
        System.out.println("Factorial of 3 is : " + f.factI(3));
        System.out.println("Factorial of 3 is : " + f.factI(4));
        System.out.println("Factorial of 3 is : " + f.factI(5));
    }
}

// use a static variable
class StaticDemo{
    int x; //a normal instance variable
    static  int y; //a static variable

    //Return the sum of the instance variable x
    //and the static variable y
    int sum(){
        return  x + y;
    }
}
class SDemo{
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //Each object has its ows copy of an instance variable
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course ob1.x and ob2.x " + " are independent");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println();

        //Each object shares one copy of a static variable
        System.out.println("The static variable y is shared");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y 19.");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100.");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();
    }
}