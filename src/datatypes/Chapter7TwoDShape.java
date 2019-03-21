package datatypes;

// A simple class hierarchy
// A class for two dimensional objects
public class Chapter7TwoDShape {
    double height;
    double width;

    void ShowDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// A subclass of TwoDShape for triangle
class Triangle extends Chapter7TwoDShape {
    String style;

    double area() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.ShowDim();
        System.out.println("Area is" + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.ShowDim();
        System.out.println("Area is " + t2.area());

    }
}

// Use the accessor methods to set and get private members

// A class for two dimensional objects
class TwoShape {
    private double width; // these are
    private double height;//now private

    // Accessor methods for width and height
    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and Height are " + width + " and " + height);
    }
}

// A subclass of TwoDShape for triangles
class Triangle1 extends TwoShape {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Shapes2 {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1();

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.style = "Filled";

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "Outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println(0);

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }
}

//Add more constructors for TwoDShape.
class TwoDShape {
    private double width;
    private double height;

    // A default constructor
    TwoDShape() {
        width = height = 0.0;
    }

    // Parametrized constructor
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    //Construct object with equal width and height.
    TwoDShape(double x) {
        width = height = x;
    }

    // Accessor methods for width and height
    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Triangle is " + width + " and " + height);
    }
}

class Triangle2 extends TwoDShape {
    private String style;

    // A default constructor
    Triangle2() {
        super();
        style = "none";
    }

    // Constructor
    Triangle2(String s, double w, double h) {
        super(w, h);//call superclass constructor

        style = s;
    }

    // One argument constructor
    Triangle2(double x) {
        super(x);

        style = "Filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class ColorTriangle2 extends Triangle2 {
    private String color;

    ColorTriangle2(String s, String c, double w, double h) {
        super(s, w, h);

        color = c;
    }

    String getColour() {
        return color;
    }

    void showColor() {
        System.out.println("Color is: " + color);
    }
}

class Shapes5 {
    public static void main(String[] args) {
        ColorTriangle2 t1 = new ColorTriangle2("Red", "outlined", 8.0, 12.0);
        ColorTriangle2 t2 = new ColorTriangle2("blue", "Filled", 2.0, 2.0);
        ColorTriangle2 t3 = new ColorTriangle2("ooo", "iii", 5.2, 4.2);


        System.out.println(" Info for t1 ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is t1: " + t1.area());

        System.out.println();

        System.out.println(" Info for t2 ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is t2: " + t2.area());

        System.out.println();

        System.out.println(" Info for t3 ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is t3: " + t3.area());

    }
}

// Demonstrate when constructors are executed
class A {
    A() {
        System.out.println("Constructing A");
    }
}

// Creat subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Constructing B");
    }
}

class C extends B {
    C() {
        System.out.println("Constructing C");
    }
}

class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}

// A superclass reference can refer to a subclass object

class X {
    int a;

    X(int i) {
        a = i;
    }
}

class Y extends X {
    int b;

    Y(int i, int j) {
        super(j);
        b = i;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // Ok both of same tapes
        System.out.println("x2.a " + x2.a);

        //X references know only about X members
        x2 = y; //still OK because Y is derived from X
        System.out.println("x2.a " + x2.a);

        // X references know only about X members
        x2.a = 19; //OK
        // x2.b = 27   ERRRRROR, X doesnt have a b member
    }
}

// Methods with differing signatures are
//overloaded and not overridden.


class A1 {
    int i, j;

    A1(int a, int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload show
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Overload1 {
    public static void main(String[] args) {
        B1 SubOb = new B1(1, 2, 3);
        SubOb.show("This is k:"); // this calls show() in B1
        SubOb.show();// this calls show in A1
    }
}

// Demonstrate dynamic method  dispatch

class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who()  in Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() in Sub2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        Sup superOB = new Sup();
        Sub1 subOB1 = new Sub1();
        Sub2 subOB2 = new Sub2();

        Sup supRef;

        supRef = superOB;
        supRef.who();

        supRef = subOB1;
        supRef.who();

        supRef = subOB2;
        supRef.who();

    }
}

// Use dynamic method dispatch
abstract class TwoDshape {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDshape() {
        width = height = 0.0;
        name = "none";
    }

    //Parametrized constructor
    TwoDshape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal width and height.
    TwoDshape(double x, String n) {
        width = height = x;
        name = n;
    }

    //Construct an object from an object
    TwoDshape(TwoDshape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //Accessor methods for width and height
    double getWidth() {
        return width;
    }

    void setWidth(double w) {
        width = w;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " + width + "and" + height);
    }

    abstract double area();

}

// A subclass of TwoDshape for triangle
class Triangle3 extends TwoDshape {
    private String style;

    // A default constructor
    Triangle3() {
        super();
        style = "none";
    }

    //Constructor for Triangle
    Triangle3(String s, double w, double h) {
        super(w, h, "Triangle");

        style = s;
    }

    // One argument constructor
    Triangle3(double x) {
        super(x, "Triangle"); // call superclass constructor

        style = "filled";
    }

    //Construct an object from an object
    Triangle3(Triangle3 ob) {
        super(ob);//pass object to TwoDshape constructor
        style = ob.style;
    }

    //Override area() for Triangle
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is" + style);
    }
}

// A subclass of TwoDshape for rectangles
class Rectangle extends TwoDshape {
    // A default constructor
    Rectangle() {
        super();
    }

    // Constructor for rectangle
    Rectangle(double w, double h) {
        super(w, h, "Rectangle");//call superclass constructor
    }

    // Construct a square
    Rectangle(double x) {
        super(x, "Rectangle");
    }

    //Construct object from an object
    Rectangle(Rectangle ob) {
        super(ob);//pass object to TwoDshape constructor
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Override area() for rectangle
    double area() {
        return getHeight() * getWidth();
    }
}

class DynShapes {
    public static void main(String[] args) {
        TwoDshape[] shapes = new TwoDshape[4];

        shapes[0] = new Triangle3("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle3(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("area is " + shapes[i].area());
            System.out.println();
        }
    }
}

//Return a String object
class ErrorMsg1{
    // Error codes
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISCERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    //Return the error massage
    String getErrorMsg1(int i){
        if (i >= 0 & i < msgs.length)
        return msgs[i];
        else
            return "Invalid Error Code";
    }
}
class FinalD{
    public static void main(String[] args) {
        ErrorMsg1 err = new ErrorMsg1();

        System.out.println(err.getErrorMsg1(err.OUTERR));
        System.out.println(err.getErrorMsg1(err.DISCERR));
    }
}