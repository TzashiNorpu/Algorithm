package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;

import algo.tzashinorpu.Week01.Chapter03.LinkedList.ListNode;

public class LeetCode_2_021_1 {
    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode concat = dummyNode;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                concat.next = l2;
                return dummyNode.next;
            }else if (l2!=null&&l1.val <=l2.val){
                concat.next = l1;
                concat = concat.next;
                l1 = l1.next;
            }

            if (l2 == null) {
                concat.next = l1;
                return dummyNode.next;
            }else if (l1!=null&&l2.val <=l1.val) {
                concat.next = l2;
                concat = concat.next;
                l2=l2.next;
            }
        }
        return dummyNode.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode concat = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                concat.next = l1;
                l1 = l1.next;
            }else {
                concat.next = l2;
                l2 = l2.next;
            }
            concat = concat.next;
        }
        concat.next = l2 == null ? l1 : l2;
        return dummyNode.next;
    }

    public static void main(String[] args) {
       /* ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));*/

        ListNode l1 = new ListNode(-9, new ListNode(3));
        ListNode l2 = new ListNode(5, new ListNode(7));
        LeetCode_2_021_1 sol = new LeetCode_2_021_1();
        ListNode listNode = sol.mergeTwoLists2(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
