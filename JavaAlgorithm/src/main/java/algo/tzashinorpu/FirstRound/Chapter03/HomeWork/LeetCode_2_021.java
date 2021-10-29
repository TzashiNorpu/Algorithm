package algo.tzashinorpu.FirstRound.Chapter03.HomeWork;


import algo.tzashinorpu.FirstRound.Chapter03.LinkedList.ListNode;

public class LeetCode_2_021 {
    // https://leetcode-cn.com/problems/merge-two-sorted-lists/
    // 将两个有序链表合并为一个新的有序链表并返回
    // 输入：1->2->4, 1->3->4   输出：1->1->2->3->4->4
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //  1->2->4, 1->3->4
        //  ----------------------------
        //  l1和l2的值由上一层的递归决定
        //  l1 = 1->2->4
        //  l2 = 1->3->4
        //  l2.next = (1->2->4, 3->4)
        //  return l2
        //  ----------------------------
        //  l1 = 1->2->4
        //  l2 = 3->4
        //  l1.next = (2->4, 3->4)
        //  return l1
        //  ----------------------------
        //  l1 = 2->4
        //  l2 = 3->4
        //  l1.next = (4, 3->4)
        //  return l1
        //  ----------------------------
        //  l1 = 4
        //  l2 = 3->4
        //  l2.next = 4
        //  l2.next = (4, 4)
        //  return l2
        //  ----------------------------
        //  l1 = 4
        //  l2 = 4
        //  l2.next = null
        //  l2.next = (4, null)
        //  return l2
        //  ----------------------------
        //  l1 = 4
        //  l2 = null
        //  return l1 : 4
        //  ----------------------------
        //  l2 = 4 -> 4
        //  ----------------------------
        //  l2 = 3->4->4
        //  ----------------------------
        //  依次替换上一层元素的指针指向
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node1_1 = new ListNode(1);
        ListNode node1_2 = new ListNode(2);
        node1_1.next = node1_2;
        ListNode node1_3;
        node1_2.next = new ListNode(4);

        ListNode node2_1 = new ListNode(1);
        ListNode node2_2 = new ListNode(3);
        node2_1.next = node2_2;
        node2_2.next = new ListNode(4);

        LeetCode_2_021 test = new LeetCode_2_021();
        ListNode node = test.mergeTwoLists(node1_1, node2_1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
