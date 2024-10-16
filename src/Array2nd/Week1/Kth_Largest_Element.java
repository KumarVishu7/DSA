package Array2nd.Week1;

import java.util.Arrays;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int arr[]={2,6,82,4,77,99,55};
        int k=2;
       int large= largest(arr,k);
        System.out.println(large);
    }
  /* static int largest(int arr[],int k){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
   }*/
    public static int largest(int arr[],int k){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-k];
    }
}
