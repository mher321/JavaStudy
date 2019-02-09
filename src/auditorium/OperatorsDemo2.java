package auditorium;

public class OperatorsDemo2 {
    public static void main(String[] args) {rigthshift();}

    static void rigthshift() {

        byte b = 2;

        printNumberAsBinary(b >> 9);
        printNumberAsBinary(b >>> 3);
        printNumberAsBinary(b << 3);
    }

        static void printNumberAsBinary(int n){
        for (int i = 15; i >= 0; i--){
            System.out.print(n >> i & 1);
            if(i % 8 == 0){
                System.out.print(' ');
            }
        }
            System.out.println();
    }
}
