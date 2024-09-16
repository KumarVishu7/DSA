package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        int n=stack.size();
         stack=reverse(stack,n);
        for(int i=0;i<n;i++){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    //using extra space
    static Stack<Integer> reverse(Stack<Integer> stack,int n){
        Stack<Integer> st1=new Stack<>();
       for(int i=0;i<n;i++){
           st1.push(stack.pop());
       }
        return st1;
    }

    // using push at bottom approach
    static void Bottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
        }else {
            int top=s.pop();
            Bottom(s,data);
            s.push(top);
        }
    }
}
