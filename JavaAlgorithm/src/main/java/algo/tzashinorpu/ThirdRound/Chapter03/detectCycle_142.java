package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;

public class detectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow1 = head;
        ListNode slow2 = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow1 = slow1.next;
            fast = fast.next.next;
            if (slow1 == fast) {
                while (slow1 != slow2) {
                    slow1 = slow1.next;
                    slow2 = slow2.next;
                }
                return slow1;
            }
        }
        return null;
    }
}
