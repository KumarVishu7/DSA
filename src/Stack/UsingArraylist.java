package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class UsingArraylist {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<Integer>();

        //add data
        public void push(int data) {
            list.add(data);
        }
        // is empty
        static boolean isEmpty(){
            return list.size()==0;
        }

        // peek
        public static int peek(){
            int data=list.get(list.size()-1);
            return data;
        }
        //pop
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

    }
    public static void main(String[] args) {
       UsingArraylist.Stack stack=new UsingArraylist.Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
