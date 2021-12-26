package algo.tzashinorpu.FirstRound.Chapter17;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public Node() {
        }
    }

    private Map<Integer, Node> cache = new HashMap<>();
    private int size;
    private int cap;
    private Node head, tail;


    public LRUCache(int capacity) {
        this.size = 0;
        this.cap = capacity;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        Node node = this.cache.get(key);
        if (node == null) {
            return -1;
        }
        remove(node);
        put(node.key, node.value);
        return node.value;
    }


    private void remove(Node node) {
        node = this.cache.get(node.key);
        if (node == null || this.size == 0) {
            return;
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        this.cache.remove(node.key);
        this.size--;
    }

    public void put(int key, int value) {
        Node n1 = new Node(key, value);
        Node n2 = this.cache.get(key);
        if (n2 != null) {
            remove(n2);
        }
        if (this.size == this.cap) {
            remove(this.tail.prev);
        }
        Node currHead = this.head.next;
        this.head.next = n1;
        n1.prev = this.head;
        currHead.prev = n1;
        n1.next = currHead;
        this.cache.put(n1.key, n1);
        this.size++;
    }
}
