package Week1;

import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
       int arr[]= { 5, 4,4, 6, 1, 3, 2, 7, 8, 9 };
       int value=4;
      int data= find(arr,value);
        System.out.println(data);
    }
   /* public static int find(int arr[],int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }*/

    public static int find(int arr[],int value){
       int index= Arrays.binarySearch(arr,value);
        return (index < 0) ? -1 : index;
    }
}
