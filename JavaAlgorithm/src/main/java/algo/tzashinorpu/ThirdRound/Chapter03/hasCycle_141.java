package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;

public class hasCycle_141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
