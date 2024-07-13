package Array2nd;

import java.util.Arrays;

public class ShiftLeftRight {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        shift(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shift(int arr[]){
        int n=arr.length;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
            i++;
            j--;
        }
    }
}
