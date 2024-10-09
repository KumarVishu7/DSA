package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=5 ;
        int x=factorial(n);
        System.out.println(x);
    }
    static int factorial(int n){

        //using recursion
        if(n==1){
            return 1;
        }
      //  int fact=factorial(n-1);
        return n*factorial(n-1);
       /* int x=1;
        for(int i=n;i>0;i--){
             x=i*x;
        }

       return x;*/
    }
}
