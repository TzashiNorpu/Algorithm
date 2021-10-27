package algo.tzashinorpu.FirstRound.Chapter03.LinkedList;

public class LeetCode_2_206_1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    /*public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 去除表头后就是最小重复
        ListNode curr = head;
        ListNode next = head.next;
        curr.next = null;

        while (next != null) {
            ListNode tmp = next.next;
            next.next = curr;
            curr = next;
            next = tmp;
        }
        return curr;
    }*/

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node3 = new ListNode(4, tail);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);

        LeetCode_2_206_1 solution = new LeetCode_2_206_1();
        ListNode res = solution.reverseList(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
