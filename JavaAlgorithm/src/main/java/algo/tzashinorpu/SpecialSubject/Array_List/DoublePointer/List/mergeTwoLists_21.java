package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;


import algo.tzashinorpu.SpecialSubject.ListNode;

public class mergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode l = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                l.next = list1;
                list1 = list1.next;
            } else {
                l.next = list2;
                list2 = list2.next;
            }
            l = l.next;
        }
        if (list1 != null) l.next = list1;
        if (list2 != null) l.next = list2;
        return dummyHead.next;
    }
}
