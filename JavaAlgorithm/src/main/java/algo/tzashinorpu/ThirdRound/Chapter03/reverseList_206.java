package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;

public class reverseList_206 {
    public ListNode reverseList(ListNode head) {
        /*ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;*/
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
