package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_025_1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nextKStartNode = head;
        for (int i = 0; i < k; i++) {
            nextKStartNode = nextKStartNode.next;
        }
        // reverse
        ListNode prev = null;
        ListNode next;
        for (int i = 0; i < k; i++) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        prev.next = nextKStartNode;

        return head;
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
        ListNode listNode = solution.reverseKGroup(head, 2);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
