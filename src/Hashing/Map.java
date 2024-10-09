package Hashing;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Map {
    private int initialSize;
    private List<Node>[] bucket;


    public Map(){
        this.initialSize = 16;
        this.bucket = new List[this.initialSize];
        for (int i=0; i<bucket.length; i++) {
            this.bucket[i] = new LinkedList<>();
        }
    }

     /*public Map(int initialSize){
        this.initialSize = initialSize;
    }*/

    public int hashCode(Integer key) {
        return key.hashCode();
    }

    public boolean equals(Integer existing, Integer newValue) {
        return Objects.equals(existing, newValue);
    }

    public void put(Integer key, Integer value){
        int hash = hashCode(key);
        int targetBucket = hash % bucket.length;

        List<Node> list = bucket[targetBucket];
        for (Node node : list) {
            if (equals(node.key, key)) {
                node.value = value;
                return;
            }
        }
        list.add(new Node(key, value));
    }
    public Integer get(Integer key) {
        int hash = hashCode(key);
        int targetBucket = hash % bucket.length;
        List<Node> list = bucket[targetBucket];
        for (Node node : list) {
            if (equals(node.key, key)) {
                return node.value;
            }
        }
        throw new NullPointerException("Key not found");
    }

    public static void main(String[] args) {
        Map map = new Map();
        map.put(3, 100);
        map.put(4, 200);
        map.put(5, 300);
        System.out.println(map.get(5));
    }

    private class Node{
        private Integer key;
        private Integer value;

        public Node (Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
}
