package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SkipElementByOne {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,8,9};
        System.out.println(Arrays.toString(arr));
        Skip(arr);

    }
    static void Skip(int arr[]){
        int n=arr.length;
       for(int i=0;i<n;i=i+2){
           System.out.print(arr[i]+" ");
       }
    }
}
