package datatypes;

public class AScii {
    public static void main(String[] args) throws java.io.IOException {
        char c;
        c = (char) System.in.read();
        if (c >= 'a' && c <= 'z') {

            c = (char) (c - 'a' + 'A');
        } else if (c >= 'A' && c <= 'Z') {

            c = (char) (c - 'A' + 'a');
        } else if (c == '.') {

            return;
        }
        System.out.println(c);
    }
}