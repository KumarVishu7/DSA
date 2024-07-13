package Arrays;

public class PairsOfArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        pairArray(arr,n);
    }
    static void pairArray(int arr[],int n){
        int totalPair=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("total numbers of pair in this array is: "+totalPair);
    }
}
