package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();// hashmap not follow the insertion order. jis order me data add kar ange usi me retrieve hoga.
       // LinkedHashMap<String,Integer> hashMap=new LinkedHashMap<>();// Linked hashmap  follow the insertion order
       // TreeMap<String,Integer> hashMap=new TreeMap<>();//  Tree map work on sorted keys.therefore time complexity is O(Log n). in output keys are i sorted order
        hashMap.put("India",1000); //O(1)
        hashMap.put("Bhutan",500);
        hashMap.put("China",2000);
        hashMap.put("Russia",5000);
        hashMap.put("Australia",1000);
        hashMap.put("Japan",8000);
        System.out.println(hashMap);

        //get -> O(1)
            int population=hashMap.get("India");// in get method write key
            System.out.println(population);

       // System.out.println(hashMap.get("Sri Lanka"));// if value not exit then return null

       // contains key->O(1)  and also check containsValue
       // System.out.println(hashMap.containsKey("China"));
        //System.out.println(hashMap.containsValue(500));

        //delete data ->O(1) using remove

        //System.out.println(hashMap.remove("Australia"));
       // System.out.println(hashMap);
       // System.out.println(hashMap.size());//check size
       // System.out.println(hashMap.isEmpty());// check map is empty or not
        //hashMap.clear();//clear entire data


        //Iteration on hashMap
        //Set<String> keys=hashMap.keySet();// using this method all keys of hashmap are stored into the set
       // System.out.println(keys);

        // now through this loop we can access the value of keys to the hashmap
        for(String value: hashMap.keySet()){
            System.out.println(value+" ->"+hashMap.get(value));
        }

    }

}
