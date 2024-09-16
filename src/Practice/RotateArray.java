package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter value of "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter what you want to rotate");
        int n2=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        rotate(arr,n2);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int arr[],int k){
        if(k>arr.length){
            k=k%arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }


}
