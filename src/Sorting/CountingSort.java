package Sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int arr[]={2,5,1,3,7,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];// +1 esliye add hua hai , counting sort positive numbers pr lagta hai .aur ye 0 to largest taq jyga.
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
}
