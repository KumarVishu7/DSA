package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,7,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        int count[]=new int[max+1];

        for(int i=0;i<n;i++){
            int element=arr[i];
            count[element]++;
        }
        int k=0;

    }
}
