import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    Node sentinal = new Node(-1, -1);
    int capacity;

    Map<Integer, Node> keyToNode = new HashMap<>();

    class Node {
        int key, value;
        Node next, prev;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
//        public void add(){
//
//        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;

    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        if (keyToNode.containsKey(key))


        sentinal.next = node;
        node.prev = sentinal;
        node.next = sentinal;
//        if ()

    }
}

