package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class mergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode root = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                root.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                root.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            root = root.next;
        }
        if (list1 != null) root.next = list1;
        if (list2 != null) root.next = list2;
        return dummyNode.next;
    }
}
