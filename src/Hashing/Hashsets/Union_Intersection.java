package Hashing.Hashsets;

import java.util.HashSet;
import java.util.Set;

public class Union_Intersection {
    public static void main(String[] args) {

        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        union(arr1,arr2);
        intersection(arr1,arr2);
    }
    static void union(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
    static void intersection(int arr1[],int arr2[]){
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                set2.add(arr2[i]);
            }
        }
        System.out.println(set2);

    }

}
