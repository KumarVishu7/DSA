package Recursion;

public class Increasing {
    public static void main(String[] args) {
        int n=5;
        increasing(n);
    }
    static void increasing(int n){
        if(n==0) return;
        increasing(n-1);
        System.out.println(n);
    }
}
