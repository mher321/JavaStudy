package datatypes;

public class FDemo {
    int x;

    FDemo (int i) {
        x = i;
    }
    // called when object is recycled
    protected void finalize (){
        System.out.println("Finalizing " + x);
    }
    // generates an object that is immediately destroyed
    void generator(int i){
        FDemo o = new FDemo(i);
        }
    }
