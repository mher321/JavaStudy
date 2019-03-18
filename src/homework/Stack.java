package homework;

import java.sql.SQLOutput;

public class Stack {
// | 6 | tos 4
// | 5 |
// | 4 |
// | 3 |
// | 1 |

// | 6 | tos 2
// | 5 |
// | 4 |


//    topOfStack 5
//  first in last out
//    tos = 0

    private int [] array ;
    private int tos = -1;

    Stack(){
        array = new int [10];
    }

    Stack(int stackLength){
        array = new int[stackLength];
    }

    void push(int value){
        if(tos == array.length - 1){
            System.out.println("Stack is full bro and I will make it bigger by 10 place");

        }
        array[++tos] = value;


    }

    int pop (){
        if(tos == -1){
            System.out.println("There is no value bro");
            return 0;
        }else {
            int value = array[tos];
            array[tos] = 0;
            tos--;
            return value;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(3);
        ArrayUtil.print(stack.array);
        stack.push(5);
        ArrayUtil.print(stack.array);
        stack.push(356);
        ArrayUtil.print(stack.array);
        stack.push(36);
        ArrayUtil.print(stack.array);
        int c = stack.pop();
        System.out.println(c);
        ArrayUtil.print(stack.array);
        c = stack.pop();
        System.out.println(c);
        ArrayUtil.print(stack.array);
         c = stack.pop();
        System.out.println(c);
        ArrayUtil.print(stack.array);
         c = stack.pop();
        System.out.println(c);
        ArrayUtil.print(stack.array);
    }
}
