package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9,11,22,33,44,56,78};
        int key=8;
       int index=search(arr,key);
        System.out.println("element present at index :"+ index);
    }
    public static int search(int[] arr, int key){
        int start=arr[0];
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparison

            if(arr[mid]==key) return mid;
            else if (arr[mid]<key){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        return -1;
    }

}
