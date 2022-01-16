package algo.tzashinorpu.Daily.CN;

import algo.tzashinorpu.Daily.COM.ListNode;

import java.util.ArrayList;
import java.util.Random;

public class randomListNode_382 {
    private ArrayList<Integer> list = new ArrayList<>();
    private int size = 0;
    private Random random = new Random();

    public randomListNode_382(ListNode head) {
        ListNode tmp1 = head;
        while (tmp1 != null) {
            this.list.add(tmp1.val);
            tmp1 = tmp1.next;
            size++;
        }

    }

    public int getRandom() {
        return this.list.get(random.nextInt(this.size));
    }
}
