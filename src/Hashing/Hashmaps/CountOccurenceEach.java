package Hashing.Hashmaps;

import java.util.HashMap;

public class CountOccurenceEach {
    public static void main(String[] args) {
        int arr[]={1,2,4,1,2,3,5,2,3,5,4,5,2};
        Check(arr);
    }
    static void Check(int arr[]) {

        // Create a HashMap to store the number of occurrences
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array using a standard for loop
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // Get the current element

            // If the number is already in the map, increment its count
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                // If the number is not in the map, add it with count 1
                map.put(num, 1);
            }
        }

        // Print the occurrences of each number
        System.out.println("Occurrences of each element:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }

}

