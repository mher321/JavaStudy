package datatypes;

// Demonstrate lifetime of variable
public class VarInitDemo {
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
