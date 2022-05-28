package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class middleNode_876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
