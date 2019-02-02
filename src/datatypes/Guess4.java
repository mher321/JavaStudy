package datatypes;

public class Guess4 {
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
