package Array2nd.Week1;

import java.util.Arrays;

public class Kth_SmallestElement {
    public static void main(String[] args) {
        int arr[]={2,6,82,4,77,99,55};
        int k=1;
        smallest(arr,k);
    }
    static void smallest(int arr[],int k){
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println(arr[k]);
    }
}
