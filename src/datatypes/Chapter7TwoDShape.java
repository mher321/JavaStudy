package datatypes;

// A simple class hierarchy
// A class for two dimensional objects
public class Chapter7TwoDShape {
    double height;
    double width;

    void ShowDim(){
        System.out.println("Width and height are " + width + " and " +height);
    }
}

// A subclass of TwoDShape for triangle
class Triangle extends Chapter7TwoDShape{
    String style;

    double area(){
        return width * height / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shapes{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: " );
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
class TwoShape{
    private double width; // these are
    private double height;//now private

    // Accessor methods for width and height
    double getWidth() {return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Width and Height are " + width + " and " + height);
    }
}

// A subclass of TwoDShape for triangles
class Triangle1 extends TwoShape{
    String style;

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shapes2{
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
class TwoDShape{
    private double width;
    private double height;

    // A default constructor
    TwoDShape(){
        width = height = 0.0;
    }

    // Parametrized constructor
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    //Construct object with equal width and height.
    TwoDShape(double x){
        width = height = x;
    }

    // Accessor methods for width and height
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}

    void showDim(){
        System.out.println("Triangle is " + width + " and " + height);
    }
}

class Triangle2 extends TwoDShape{
    private String style;

    // A default constructor
    Triangle2(){
        super();
        style = "none";
    }

    // Constructor
    Triangle2(String s, double w, double h){
        super(w, h);//call superclass constructor

        style = s;
    }
    // One argument constructor
    Triangle2(double x){
        super(x);

        style = "Filled";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shapes5{
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        Triangle2 t2 = new Triangle2("outlined ", 8.0, 12.0);
        Triangle2 t3 = new Triangle2(4.0);

        t1 = t2;

        System.out.println(" Info for t1 ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is t1: " + t1.area());

        System.out.println();

        System.out.println(" Info for t2 ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is t2: " + t2.area());

        System.out.println();

        System.out.println(" Info for t3 ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is t3: " + t3.area());

    }
}

