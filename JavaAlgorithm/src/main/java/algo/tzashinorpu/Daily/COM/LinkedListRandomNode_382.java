package algo.tzashinorpu.Daily.COM;


import java.util.Random;

public class LinkedListRandomNode_382 {
    /*ListNode head;

    public LinkedListRandomNode_382(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        ListNode p = this.head;
        int i = 1;
        int res = 0;
        while (p != null) {
            if (Math.random() * i < 1) res = p.val;
            p = p.next;
            i++;
        }
        return res;
    }*/
    private int size = 0;
    private int[] ints;
    Random random = new Random();

    public LinkedListRandomNode_382(ListNode head) {
        ListNode root = head;
        while (head != null) {
            this.size++;
            head = head.next;
        }
        head = root;
        this.ints = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            this.ints[i] = head.val;
            head = head.next;
        }
    }

    public int getRandom() {
        return this.ints[random.nextInt(this.size)];
    }
}


