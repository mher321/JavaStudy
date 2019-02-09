package auditorium;

public class Person {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println(" Write age:");
        int age = System.in.read();
        switch(age) {
            case '1':
                System.out.println("it`s cool");
                break;
            case '8':
                System.out.println("go army:");
                break;
            default:
                System.out.println("miss");
        }
//????????

    }
}
