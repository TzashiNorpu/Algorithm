package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class deleteDuplicates_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode r = head;
        while (r != null) {
            while (r != null && head.val == r.val) r = r.next;
            head.next = r;
            head = r;
        }
        return dummyHead.next;
    }
}
