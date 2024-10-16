package Hashing.Hashmaps;

import java.util.HashMap;

public class CountOccurenceWords {
   static void count(String str){
       String[] split = str.split("\\s+");
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<split.length;i++){
           String data=split[i];
           String lowerCase = data.toLowerCase();
           if(map.containsKey(lowerCase)){
               map.put(lowerCase,map.get(lowerCase)+1);
           }else{
               map.put(lowerCase,1);
           }
       }
       for(String keys:map.keySet()){
           System.out.println(keys+" is that "+map.get(keys));
       }



      /* HashMap<String,Integer> map=new HashMap<>();
       for(String word:split){
           word.toLowerCase();
           if(map.containsKey(word)){
               map.put(word,map.get(word)+1);
           }else{
               map.put(word,1);
           }
       }

       for(String keys:map.keySet()){
           System.out.println(keys+" occurence is that:"+map.get(keys));
       }*/
   }
    public static void main(String[] args) {
        String str="what We think we become";
        count(str);
    }
}
