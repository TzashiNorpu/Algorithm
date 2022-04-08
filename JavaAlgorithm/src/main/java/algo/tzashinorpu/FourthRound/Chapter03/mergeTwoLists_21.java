package algo.tzashinorpu.FourthRound.Chapter03;

public class mergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1->2->4
        // 5
        ListNode dummyNode = new ListNode(0);
        ListNode concat = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                concat.next = list1;
                list1 = list1.next;
            } else {
                concat.next = list2;
                list2 = list2.next;
            }
            concat = concat.next;
        }
        if (list1 == null) {
            concat.next = list2;
        }
        if (list2 == null) {
            concat.next = list1;
        }
        return dummyNode.next;
    }
}
