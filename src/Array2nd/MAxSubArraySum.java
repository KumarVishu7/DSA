package Array2nd;


public class MAxSubArraySum {
    public static void main(String[] args) {
        // int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int arr[]={2,3,-3,4,3};
         KadansAlgoSum(arr);
        // sum(arr);
        product(arr);
    }

     /*  // 1st technique is ->Simple Approach . time complexity is o(n)3

     public  static void sum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               currSum=0;
               for(int k=i;k<=j;k++){
                   currSum +=arr[k];
               }
               System.out.println("Sum is :"+currSum);
               if(maxSum<currSum){
                   maxSum=currSum;
               }
           }
       }
         System.out.println("max sum of All subArrays is: "+maxSum);
    }*/

    // 2nd approach--> Kadane approach

    public static void KadansAlgoSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            max=Math.max(currentSum,max);
            if(currentSum<=0){
                currentSum=0;
            }

        }
        System.out.println("Maximum sum is :"+max);

    }

    //maximum product of subArray using kadane algo
    static void product(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=1;
        for(int i=0;i<arr.length;i++){
            curr=curr*arr[i];
             max=Math.max(max,curr);
            if(curr<0){
                curr=0;
            }
        }
        System.out.println("Maximum product is: "+max);

    }



    // sum of subArrays
   /* public static void sum(int arr[]) {//int arr[]={2,3,-3,4,5};
        int n = arr.length;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            for(int j=i;j<n;j++){
                currSum=currSum+arr[j];
                System.out.println(currSum);
            }
            currSum=0;
        }
    }*/
}
