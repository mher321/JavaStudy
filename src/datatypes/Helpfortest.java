package datatypes;

public class Helpfortest {
    public static void main(String[] args) throws java.io.IOException {
        char choise, ignore;

        do {
            System.out.println("Help on:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. for");
            System.out.println("    4. while");
            System.out.println("    5. do-while");
            System.out.println("CHoose one ");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
                }while (ignore != '\n');
            }while (choise < '1' | choise > '5');
        }
}
