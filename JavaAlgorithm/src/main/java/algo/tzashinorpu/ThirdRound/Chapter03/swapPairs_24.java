package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;

public class swapPairs_24 {
    public ListNode swapPairs(ListNode head) {
        // 1->2->3->null 2->1->3->null
        // 1->2->null 2->1->null
        ListNode curr = head;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (curr != null && curr.next != null) {
            ListNode next = curr.next;
            ListNode nnext = next.next;
            prev.next = next;
            next.next = curr;
            curr.next = nnext;
            prev = curr;
            curr = nnext;
        }
        return dummyHead.next;
    }
}
