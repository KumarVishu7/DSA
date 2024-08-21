package Strings;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String str1="manager";
        String str2="agmaern";
        char arr[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Arrays.equals(arr,arr2)){
            System.out.println("equal");
        }else System.out.println("not");
    }

}
