package datatypes;

public class Finalize {
    public static void main(String[] args) {

        int count;

        FDemo ob = new FDemo(0);
        /* Now generate a large number of objects. At some point,
        garbage collection will occur.
        Note: you might need increase the number
        of objects generated in order to force
        garbage colection
         */
        for (count = 0; count < 900000; count++)
            ob.generator(count);
    }
}
