package Hashing.Hashsets;

public class Nested {
    private static int x=20;
     //class inner{
     static class inner{
        void data(){
            System.out.println("this is inner class"+x);
        }
    }
    public static void main(String[] args) {
         /*Nested nested=new Nested();
        Nested.inner obj= nested.new inner();*/
        Nested.inner obj=new Nested.inner();
        obj.data();
    }
}
