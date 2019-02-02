package datatypes;

public class First {
    public static void main (String args[]){
        System.out.println("Hello");

    }
}

class Rock_Distance {
    public static void main (String args[]){

        double dist;

        dist = 7920 / 2;

        System.out.println("datatypes.Sound propagates to the object is " + dist + " feet per second");

    }
}


class LoopForDot {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        for (ch = 0 ;; ch++)
            if (ch == '.')
                System.in.read();
            else break;

    }
}

class Progression {
    public static void main(String[] args) {
        for (int i = 1; i<1000; i *= 2 ) {
            System.out.println(i);
        }
    }
}


class DecrDemo2 {
    public static void main(String[] args) {
        int i;
        for(i = 1000; i >= 0; i-=2 ){
            System.out.println(i);
        }
    }
}


class AScii {
    public static void main(String[] args) throws java.io.IOException {
        char c;
        c = (char) System.in.read();
        if (c >= 'a' && c <= 'z') {

            c = (char) (c - 'a' + 'A');
        } else if (c >= 'A' && c <= 'Z') {

            c = (char) (c - 'A' + 'a');
        } else if (c == '.') {

            return;
        }
        System.out.println(c);
    }
}
