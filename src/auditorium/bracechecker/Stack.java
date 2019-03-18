package auditorium.bracechecker;

public class Stack {
    char [] array;
    int tos = -1 ;

    void push (char ch){
        if (tos == array.length -1){
            System.out.println("full");
        }

    }



}
