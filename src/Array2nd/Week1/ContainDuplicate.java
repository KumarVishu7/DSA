package Array2nd.Week1;

import java.util.*;

public class ContainDuplicate {
    public static void main(String[] args) {
        int arr[]={2,4,2,5,7,3,2,5,2,3,3,3,2};
        //int arr[]={1,2,3,4,5};
        boolean b=Duplicate(arr);
        System.out.println(b);

    }
    public static boolean Duplicate(int arr[]){
        //using set
        /*Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])) return true;
            else{
                set.add(arr[i]);
            }
        }
        return false;*/

        // using map
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int data=arr[i];
            if(map.containsKey(data)){
                return true;
            }
            map.put(data,1);
        }
        return false;
    }
}
