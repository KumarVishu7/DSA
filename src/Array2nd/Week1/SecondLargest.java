package Array2nd.Week1;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        int data=largest(arr);
        System.out.println(data);
    }
    static int largest(int arr[]){
        int n=arr.length;
        int firstLarge=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>firstLarge){
                firstLarge=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>secondLarge && arr[i] !=firstLarge){
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }

}
