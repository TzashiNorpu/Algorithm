package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode();
        ListNode curr = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode((carry + val1 + val2) % 10);
            carry = (carry + val1 + val2) / 10;
            curr = curr.next;
        }
        if (carry == 1) curr.next = new ListNode(1);
        return dummyNode.next;
    }
}
