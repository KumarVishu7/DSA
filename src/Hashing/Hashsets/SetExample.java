package Hashing.Hashsets;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);// its element not added because duplicate not allowed into set
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(5);// its element not added because duplicate not allowed into set
        hashSet.add(6);
        hashSet.add(7);
        System.out.println(hashSet);
      /*  if(hashSet.contains(3)){
            System.out.println("its contains");
        }else System.out.println("not contain");*/

        hashSet.remove(3);
        System.out.println(hashSet);
    }
}
