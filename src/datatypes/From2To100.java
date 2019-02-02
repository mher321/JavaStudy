package datatypes;

public class From2To100 {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
            int a = i;
        }

        System.out.println();

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            int j = 2;

            for(; j <= i / 2; j++) {
                if(i % j == 0) {

                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(" " + i);
            }
        }


        int a = 2;
        int b = a++;  // a++ <=>   a = a + 1
        System.out.println(a);
        System.out.println(b);

        b = ++a;
        System.out.println(a);
        System.out.println(b);

    }
}