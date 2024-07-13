package Arrays;

public class LargestElement {
    public static void main(String[] args) {
       int arr[]={2,-5,8,12,45,6,64,78,99,2};
       int value= largestElement(arr);
        System.out.println(value);

    }
    public static int largestElement(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }if(arr[i]<min){
                min=arr[i];
            }
        }
        //return max;
        return min;
    }
}
