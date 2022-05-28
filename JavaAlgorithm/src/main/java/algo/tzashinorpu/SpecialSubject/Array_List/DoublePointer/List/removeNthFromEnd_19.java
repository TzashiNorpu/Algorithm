package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class removeNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]
        */
        /*Input: head = [1], n = 1
        Output: []
        */
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode l1 = dummyHead, l2 = dummyHead;
        for (int i = 0; i <= n; i++) {
            l1 = l1.next;
        }
        while (l1 != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        l2.next = l2.next.next;
        return dummyHead.next;
    }
}
