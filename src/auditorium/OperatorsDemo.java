package auditorium;

public class OperatorsDemo {

    public static void main(String[] args) {
        leftShift();
    }



    static void leftShift() {
        byte b = -1;
        printNumberAsBinary(b >> 3);
        printNumberAsBinary(b >>> 3);
        printNumberAsBinary(b << 6);
//        System.out.println(b << 31);
    }

    static void printNumberAsBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >> i & 1);
            if (i % 8 == 0){
                System.out.print(' ');
            }
        }
        System.out.println();
    }

}