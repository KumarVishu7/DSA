package Stack;

public class UsingLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head=null;

        //is empty function
        static boolean isEmpty(){
            return head==null;
        }

        // push function
        static void push(int data){
            Node temp=new Node(data);
            temp.next =head;
            head=temp;
        }

        //pop function
        static int pop(){
            int top=head.data;
            head=head.next;
            return top;
        }
        //peek
        static int peek(){
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        stack.push(6);
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}
