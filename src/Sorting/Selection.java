package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]={4,2,-1,0,6,3,2,5};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i ;
           for(int j=i+1;j<n-1;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
           }
           //swap
            int temp=arr[min];
           arr[min]=arr[i];
           arr[i]=temp;
        }

    }
}
