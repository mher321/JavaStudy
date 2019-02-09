package auditorium;

public class MethodTest {
    public static void main(String[] args) {
        double c = 5;
        double b = 16.4;
        c = count(c);
        b = count(b);
        System.out.println(c);
        System.out.println(b);

    }

    public static double count(double x) {
        x += 1.5;
        return x;

    }
}
