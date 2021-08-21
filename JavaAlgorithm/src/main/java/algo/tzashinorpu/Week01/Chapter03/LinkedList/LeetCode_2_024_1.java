package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_024_1 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode prev = dummyHead;
        prev.next = head;
        while (head != null && head.next != null) {
            // head.next != null => head.next.next 不会报错
            ListNode tmp = head.next.next;
            prev.next = head.next;
            head.next = tmp;
            prev.next.next = head;
            prev = head;
            head = tmp;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node3 = new ListNode(4, tail);
        ListNode node2 = new ListNode(3, node3);

        /*ListNode tail = new ListNode(4);
        ListNode node2 = new ListNode(3, tail);*/

        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        LeetCode_2_024_1 solution = new LeetCode_2_024_1();
        ListNode listNode = solution.swapPairs(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
