package auditorium.bracechecker;

public class BraceChecker {
    public Stack stack;
    public String resultMassage = "There is No error";

    BraceChecker() {
        stack = new Stack();
    }

    public void parse(String txt) {

        char ch = 0;
        char stkLastElement = 0;
        int i = 0;
        lab:
        for (; i < txt.length(); i++) {
            ch = txt.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    stkLastElement = stack.pop();
                    if (stkLastElement != '{') {
                        break lab;
                    }
                    break;
                case ']':
                    stkLastElement = stack.pop();
                    if (stkLastElement != '[') {
                        break lab;
                    }
                    break;

                case ')':
                    stkLastElement = stack.pop();
                    if (stkLastElement != '(') {
                        break lab;
                    }
            }
        }
        if (i < txt.length()) {
            if (stkLastElement == 0) {
                //opened but never closed?
                resultMassage = "Error: Closed '" + ch + "' but not opened ";
            } else {
                resultMassage = "Error: Opened '" + stkLastElement + "' but closed '" + ch + "'.";
            }
        } else if ((stkLastElement = stack.pop()) != 0) {
            resultMassage = "Error: Opened '" + stkLastElement + "' but not closed '";
        }
    }
}

class BrTest {
    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        braceChecker.parse("I (can open and close} ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I [can open  and close} ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I {can open  and close} ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I [can open  and close) ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I [can open  and close] ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I (can open  and close] ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I {can open  and close) ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I {can open  and close] ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse("I {can open  and close ");
        System.out.println(braceChecker.resultMassage);

        braceChecker.parse(" I can open  and close ");
        System.out.println(braceChecker.resultMassage);
    }
}