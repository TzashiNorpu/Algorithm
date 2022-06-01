package algo.tzashinorpu.SpecialSubject.DataStruct;

import java.util.HashMap;

public class LRUCache {
    class Node {
        public int key, val;
        public Node next, prev;

        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    class DoubleList {
        // 头尾虚节点
        private Node head, tail;
        // 链表元素数
        private int size;

        public DoubleList() {
            // 初始化双向链表的数据
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        // 在链表尾部添加节点 x，时间 O(1)
        public void addLast(Node x) {
            x.prev = tail.prev;
            x.next = tail;
            tail.prev.next = x;
            tail.prev = x;
            size++;
        }

        // 删除链表中的 x 节点（x ⼀定存在）
        // 由于是双链表且给的是⽬标 Node 节点，时间 O(1)
        public void remove(Node x) {
            x.prev.next = x.next;
            x.next.prev = x.prev;
            size--;
        }

        // 删除链表中第⼀个节点，并返回该节点，时间 O(1)
        public Node removeFirst() {
            if (head.next == tail)
                return null;
            Node first = head.next;
            remove(first);
            return first;
        }

        // 返回链表⻓度，时间 O(1)
        public int size() {
            return size;
        }
    }

    // key -> Node(key, val)
    private HashMap<Integer, Node> map;
    // Node(k1, v1) <-> Node(k2, v2)...
    private DoubleList cache;
    // 最⼤容量
    private int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    /* 将某个 key 提升为最近使⽤的 */
    private void makeRecently(int key) {
        Node x = map.get(key);
        // 先从链表中删除这个节点
        cache.remove(x);
        // 重新插到队尾
        cache.addLast(x);
    }

    /* 添加最近使⽤的元素 */
    private void addRecently(int key, int val) {
        Node x = new Node(key, val);
        // 链表尾部就是最近使⽤的元素
        cache.addLast(x);
        // 别忘了在 map 中添加 key 的映射
        map.put(key, x);
    }

    /* 删除某⼀个 key */
    private void deleteKey(int key) {
        Node x = map.get(key);
        // 从链表中删除
        cache.remove(x);
        // 从 map 中删除
        map.remove(key);
    }

    /* 删除最久未使⽤的元素 */
    private void removeLeastRecently() {
        // 链表头部的第⼀个元素就是最久未使⽤的
        Node deletedNode = cache.removeFirst();
        // 同时别忘了从 map 中删除它的 key
        int deletedKey = deletedNode.key;
        map.remove(deletedKey);
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        // 将该数据提升为最近使⽤的
        makeRecently(key);
        return map.get(key).val;
    }

    public void put(int key, int val) {
        if (map.containsKey(key)) {
            // 删除旧的数据
            deleteKey(key);
            // 新插⼊的数据为最近使⽤的数据
            addRecently(key, val);
            return;
        }

        if (cap == cache.size()) {
            // 删除最久未使⽤的元素
            removeLeastRecently();
        }
        // 添加为最近使⽤的元素
        addRecently(key, val);
    }
}
