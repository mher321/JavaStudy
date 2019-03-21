package auditorium.bracechecker;

public class Stack {
    char[] array;
    int tos = -1;

    Stack() {
        array = new char[6];
    }

    void push(char ch) {
        if (tos == array.length - 1) {
            System.out.println("full");

            array[++tos] = ch;
        }
    }

    char pop() {
        if (tos == -1) {
            System.out.println("no parser");
        }
        return 0;
    }
}

