package algo.tzashinorpu.SpecialSubject.Array_List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyNode = new ListNode();
        ListNode root = dummyNode;
        while (l1 != null || l2 != null) {
            int v1 = 0;
            if (l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            int v2 = 0;
            if (l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }
            int sum = carry + v1 + v2;
            root.next = new ListNode(sum % 10);
            carry = sum / 10;
            root = root.next;
        }
        if (carry == 1) root.next = new ListNode(1);
        return dummyNode.next;
    }

}
