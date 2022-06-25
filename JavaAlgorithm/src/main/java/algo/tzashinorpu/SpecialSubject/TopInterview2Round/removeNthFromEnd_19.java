package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class removeNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // fast 要删除的下一个节点
        // slow 要删除的上一个节点
//        ListNode fast = head, slow = head;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        while (n-- != -1) fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}
