package Hashing.Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4, 5};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] res = sum(arr, target);
        if (res.length == 2) {
            System.out.println("Indices: " + res[0] + ", " + res[1]);
        } else {
            System.out.println("No solution found");
        }
    }

    public static int[] sum(int[] arr, int target) {

        // using hashmap
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement
            int complement = target - arr[i];

            // If the complement is found in the map, return the indices
            if (map.contains(complement)) {
                return new int[]{complement, arr[i]};

            }
            // Otherwise, add the current number and its index to the map
            map.add(arr[i]);
        }
        return new int[]{};
    }

}


