package Recursion;

public class Decreasing {
    public static void main(String[] args) {
        int n=5;
        decreasing(n);
    }
    static void decreasing(int n){
        if(n==0) return;
        System.out.println(n);
        decreasing(n-1);
    }
}
