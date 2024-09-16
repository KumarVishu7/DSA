package Stack;

import java.util.Stack;

public class usingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
