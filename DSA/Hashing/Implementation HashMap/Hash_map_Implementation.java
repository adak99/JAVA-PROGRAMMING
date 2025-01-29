import java.util.ArrayList;
import java.util.LinkedList;
/*
 *  Implementation HashMap
 *  functions time complexity O(1)
 *  -> put()
 *  -> get()
 *  -> containsKey()
 *  -> remove()
 *  -> size()
 *  -> keySet()
 */

public class Hash_map_Implementation {
    static class HashMap<K, V> { // generics
        private class Node {
            K key;
            V vlaue;

            // @SuppressWarnings("unused")
            public Node(K key, V value) {
                this.key = key;
                this.vlaue = value;
            }
        }

        private int n; // total numbers of nodes
        private int N; // total number of bukets
        private LinkedList<Node> bukets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.bukets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.bukets[i] = new LinkedList<>();
            }
        }

        // return buket index
        public int hashFunction(K key) { // 0 to n-1
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // serach key
        private int searchInList(K key, int bi) {
            LinkedList<Node> ll = bukets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key)
                    return i; // data index (di)
            }

            return -1;
        }

        // rehash
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBukets[] = bukets;
            bukets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                bukets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBukets.length; i++) {
                LinkedList<Node> ll = oldBukets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.vlaue);
                }
            }
        }

        // put method
        public void put(K key, V value) {
            int bi = hashFunction(key); // black box
            int di = searchInList(key, bi); // search if the key is present or not

            if (di == -1) { // key dosn;t exits
                bukets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = bukets[bi].get(di);
                node.vlaue = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0)
                rehash();// rehashing
        }

        // get function
        public V get(K key) {
            int bi = hashFunction(key); // black box
            int di = searchInList(key, bi); // search if the key is present or not

            if (di == -1) { // key dosn;t exits
                return null;
            } else {
                Node node = bukets[bi].get(di);
                return node.vlaue;
            }
        }

        // contains method
        public boolean containsKey(K key) {
            int bi = hashFunction(key); // black box
            int di = searchInList(key, bi); // search if the key is present or not

            if (di == -1) // key dosn;t exits
                return false;
            else
                return true;
        }

        // remove function
        public V remove(K key) {
            int bi = hashFunction(key); // Get the bucket index
            int di = searchInList(key, bi); // Get the data index within the bucket

            if (di == -1) { // Key doesn't exist
                return null;
            } else {
                Node node = bukets[bi].remove(di); // Remove the node at the index
                n--; // Decrease the total node count
                return node.vlaue; // Return the removed value
            }
        }

        // keySet method
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < bukets.length; i++) {
                LinkedList<Node> ll = bukets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // is empty function
        public boolean isEmpty() {
            return n == 0;
        }

        // size
        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 190);
        map.put("China", 230);
        map.put("Indonesia", 89);

        System.out.println("Before removal:");
        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("\nRemoving 'India'...");
        map.remove("India");

        System.out.println("\nAfter removal:");
        keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println("\nSize of the map: " + map.size());
    }
}
