package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class detectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head, p = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }
                return p;
            }
        }
        return null;
    }
}
