package auditorium.bracechecker;

public class Stack {
    public static final int DEFAULT_SIZE = 16;

    private char[] array;
    private int tos = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }


    public Stack(int size) {
        array = new char[size];
    }

    void push(char ch) {
        if (tos == array.length - 1) {
            System.out.println("stack is full");
        } else {
            array[++tos] = ch;
        }
    }

    char pop() {
        if (tos < 0) {
            System.out.println("stack is empty ");
            return 0;
        }
        return array[tos--];
    }
}

