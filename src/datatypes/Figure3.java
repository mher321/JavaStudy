package datatypes;

public class Figure3 {
        public static void main (String args[]) {
            int length = 4;
            for (int i = 1; i <=  length; i++) {
                int j = 1;
                for ( ; j <= i-1; j++) {
                    System.out.print(" ");
                }
                for (; j <= length; j++) {
                    System.out.print(" *");
                }
                System.out.print('\n');
            }
            System.out.print('\n');
        }
    }
