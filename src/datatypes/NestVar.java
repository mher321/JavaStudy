package datatypes;

/* This program attempts to declare a variable
in an inner scope white the same name as one
defined in an outer scope.
 */
public class NestVar {
    public static void main (String args[]){
        int count;

        for(count = 0; count < 10; count= count + 1){
            System.out.println("This is count: " +  count);

            int countd; //illegal
            for(countd = 0; countd < 2 ; countd++)
                System.out.println("This program is ERROR!!!");
        }
    }
}
