package Recursion;

public class Sum_Naturals {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //Naturals(arr);
        int n=5;
       int data= recursion(n);
        System.out.println(data);
    }
    static void Naturals(int arr[]) {
        int sum = 0;
        int n = arr.length;
        // sum=(n*(n+1))/2;
        // System.out.println(sum);

        //2nd approach using for loop

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    //3rd approach using recursion
    static int recursion(int n){
        if (n <= 1)
            return n;
        int x=n + recursion(n - 1);
        return x;

    }
}
