package Stack;

import java.util.Stack;

public class PushAtBottom {
    static void Bottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
        }else {
            int top=s.pop();
            Bottom(s,data);
            s.push(top);
        }
    }

   // reverse string using stack
    static String reverse(String str){
        Stack<Character> st=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            char result=st.pop();
            sb.append(result);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        int data=8;
        Bottom(stack,data);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

        // reverse string using stack
      /*  String str="Hello World";
        String str1=reverse(str);
        System.out.println(str1);*/

    }
}
