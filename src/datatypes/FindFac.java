package datatypes;

public class FindFac {
    public static void main(String[] args) {
        int i;
        for (i=2; i<=50; i++){
            System.out.print("Factors of " + i + ":");
            for (int j = 4; j < i; j++)
                if ((i%j) == 0)
                    System.out.print(j + " ");
            System.out.println();
            }
        }
    }

