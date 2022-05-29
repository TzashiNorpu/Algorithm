package algo.tzashinorpu.SpecialSubject.Array_List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recursive(l1, l2, 0);
    }

    private ListNode recursive(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) return null;
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        int val = sum % 10;
        carry = val / 10;
        ListNode node = new ListNode(val);
        node.next = recursive(l1.next, l2.next, carry);
        return node;
    }
}
