package Arrays;

public class SubArrays {  // subArray  is a contiguous part of array
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int n=arr.length;
        printSubArray(arr,n);
    }
    static void printSubArray(int arr[],int n){
        
        int totalSubArray=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
        }
        System.out.println("total subArray is :"+totalSubArray);
    }
}
