package datatypes;

public class LoopForDot {
    public static void main(String[] args) throws java.io.IOException {
        char ch;
        for (ch = 0 ;; ch++)
            if (ch == '.')
                System.in.read();
            else break;

    }
}