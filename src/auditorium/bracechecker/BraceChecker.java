package auditorium.bracechecker;

public class BraceChecker {
    public Stack stack;
    public String resultMassage;

    //TODO add constructor

    public void parse(String txt) {

        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                System.out.println("pars is open");

            }
        }
    }
}
