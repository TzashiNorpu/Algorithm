package algo.tzashinorpu.SpecialSubject.Array_List.Recursive;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class reverseList_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
