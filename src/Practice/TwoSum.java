package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,3,7,9,8};
       // int arr[]={};
        int target=11;
       int arr1[]= twoSum(arr,target);
        System.out.println(Arrays.toString(arr1));
    }

    //using hashmap
   /* static int[] twoSum(int arr[],int target){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        if(arr.length==0){
            return null;
        }
        for(int i=0;i< arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                int i1 = hashMap.get(arr[i]);
                  int arr2 []={i1,i};
                  return arr2;
            }else{
                hashMap.put(target-arr[i],i);
            }
        }
        return null;
    }*/



    //its work on sorted array
    static int[] twoSum(int arr[],int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int data = arr[i] + arr[j];
            if (data < target) {
                i++;
            } else if (data > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
        return null;
    }

    // another approach
        /* static int[] twoSum(int[] numbers, int target) {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        int solution[]={i,j};
                        return solution;
                    }
                }
            }
            return null;

        }*/
}
