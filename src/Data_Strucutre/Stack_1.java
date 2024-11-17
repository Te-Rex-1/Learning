package Data_Strucutre;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        System.out.println(stk.size());
        System.out.println("Elements in stack:"+stk);
        System.out.println("is stack empty or not "+stk.empty());
        System.out.println("Peek Element :"+stk.peek());
    }
}
