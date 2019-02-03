package auditorium;

public class OperatorsDemo2 {
    public static void main(String[] args) {leftShift();}

    static void leftShift() {

        byte b = -1;

        printNumberAsBinary(b >> 3);
    }

        static void printNumberAsBinary(int n){
        for (int i = 7; i >= 0; i--){
            System.out.print(n >> i & 1);
            if(i % 4 == 0){
                System.out.print(' ');
            }
        }
    }
}
