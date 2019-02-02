package datatypes;

public class LtoD {
    public static void main (String args[]){

        long L;
        float F;

        L = 1324564L;
        F = L;
        System.out.println(L + " " + F);
        for (double i = 0.1; i != 1 ; i += 0.1) {
            System.out.println(i);
        }
        System.out.println("end");
    }
}
