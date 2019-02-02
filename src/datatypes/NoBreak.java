package datatypes;
// Demonstrate the switch without break statements.
public class NoBreak {
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
