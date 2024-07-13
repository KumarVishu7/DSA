package Week1;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int arr[]={2,4,2,5,7,3,2,5,2,3,3,3,2};
        boolean b=Duplicate(arr);
        System.out.println(b);

    }
    public static boolean Duplicate(int arr[]){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])) return true;
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
