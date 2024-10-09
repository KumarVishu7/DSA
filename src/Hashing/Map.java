package Hashing;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Map<K, V> {
    private int initialSize;
    private List<Node<K, V>>[] bucket;


    public Map(){
        this.initialSize = 16;
        this.bucket = new List[this.initialSize];
    }

     /*public Map(int initialSize){
        this.initialSize = initialSize;
    }*/

    public int hashCode(K key) {
        return Math.abs(key.hashCode());
    }

    public boolean equals(K existing, K newKey) {
        return Objects.equals(existing, newKey);
    }

    public void put(K key, V value){
        int hash = hashCode(key);
        int targetBucket = hash % bucket.length;

        List<Node<K, V>> list = getListFromBucket(targetBucket);
        for (Node<K, V> node : list) {
            if (equals(node.key, key)) {
                node.value = value;
                return;
            }
        }
        list.add(new Node<>(key, value));

    }
    public V get(K key) {
        int hash = hashCode(key);
        int targetBucket = hash % bucket.length;
        List<Node<K, V>> list = getListFromBucket(targetBucket);
        for (Node<K, V> node : list) {
            if (equals(node.key, key)) {
                return node.value;
            }
        }
        throw new NullPointerException("Key not found");
    }
    public boolean containsKey(K key){
       int hash= hashCode(key);
        int targetBucket = hash % bucket.length;
        List<Node<K, V>> list = getListFromBucket(targetBucket);
        for(Node<K, V> node : list){
            if(equals(node.key, key)){
                return true;
            }
        }
        return false;
    }

    private List<Node<K, V>> getListFromBucket(int targetBucket) {
        if (bucket[targetBucket] == null) {
            return bucket[targetBucket] = new LinkedList<>();
        }
        return bucket[targetBucket];
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new Map<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
    }

    private static class Node<K, V> {
        private K key;
        private V value;

        public Node (K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}