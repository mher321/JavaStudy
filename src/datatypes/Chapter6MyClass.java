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
    void noChange (int i,int j){
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