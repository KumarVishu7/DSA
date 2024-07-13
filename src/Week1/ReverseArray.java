package Week1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int n=arr.length;
        reverse(arr,n);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int arr[],int n){
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}
