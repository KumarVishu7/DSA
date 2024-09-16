package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        // find all element that appear more than (n/3) times;

        int arr[]={1,2,2,4,5,7,2,3,2,3,2,3,4,4,3};
        int n=arr.length;
       find(arr,n);

    }
    static void find(int arr[],int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int res = arr[i];
            if (map.containsKey(res)) {
                map.put(res, map.get(res) + 1);
            } else {
                map.put(res, 1);
            }
        }
        //find all element
       /* for(int keys: map.keySet()){
            System.out.println(keys + " occures " + map.get(keys));
        }*/

        //find majority
        for (Integer keys :map.keySet()) {
            if (map.get(keys) >= arr.length/3) {
                System.out.println(keys + " occures " + map.get(keys));
            }else System.out.println("-1");
        }

        //find maximum occurrence element
       /* int max= Integer.MIN_VALUE;
        for (Integer keys : map.keySet()) {
            if (map.get(keys) >= max) {
                max=map.get(keys);
                System.out.println(keys+" maximum occured element into the array count is : "+max);
            }
        }*/


    }
}
