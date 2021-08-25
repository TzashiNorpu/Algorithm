package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_025_1 {
    // Input:1->2->3->4->5,k=2  Output:2->1->4->3->5
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode kTail = null;
        ListNode kHead = null;

        return head;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node3 = new ListNode(4, tail);
        ListNode node2 = new ListNode(3, node3);

        /*ListNode tail = new ListNode(4);
        ListNode node2 = new ListNode(3, tail);*/

        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        LeetCode_2_025_1 solution = new LeetCode_2_025_1();
        ListNode listNode = solution.reverseKGroup(head,2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
