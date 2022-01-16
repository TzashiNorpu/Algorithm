package algo.tzashinorpu.Daily.CN;

import algo.tzashinorpu.Daily.COM.ListNode;

public class randomListNode_382_1 {
    private ListNode tmp;

    public randomListNode_382_1(ListNode head) {
        this.tmp = head;
    }

    public int getRandom() {
        // 每取一次都要遍历完这个 list
        ListNode p = this.tmp;
        int i = 1;
        int ans = 0;
        while (p != null) {
            // 1/N
            if (Math.random() * i < 1) ans = p.val;
            p = p.next;
            i++;
        }
        return ans;
    }
}
