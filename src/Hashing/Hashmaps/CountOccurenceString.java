package Hashing.Hashmaps;

import java.util.HashMap;

public class CountOccurenceString {

    static void Count(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isLetter(ch)) {
                // Convert character to lowercase to make the count case-insensitive (optional)
                ch = Character.toLowerCase(ch);

                // If character is already in the map, increment its count
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    // If character is not in the map, add it with a count of 1
                    map.put(ch, 1);
                }
            }
        }
        // Print the occurrences of each character
        for(Character ch : map.keySet()) {
            System.out.println(ch + " occurred " + map.get(ch) + " time(s)");
        }

    }
    public static void main(String[] args) {
        String str="Vishu Saroha";
       Count(str);

    }
}
