package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;


public class reverseKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode tail = head;
        ListNode nxtHead = head;
        while (head != null) {
            int cnt = k;
            while (tail != null && (--cnt) > 1) {
                tail = tail.next;
            }
            if (tail == null) {
                break;
            }
            ListNode newHead = reverse(head);
        }
        return dummyNode.next;
    }

    private ListNode reverse(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
