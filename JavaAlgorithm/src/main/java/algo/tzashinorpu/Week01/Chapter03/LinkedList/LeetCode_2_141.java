package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_141 {
    // https://leetcode-cn.com/problems/linked-list-cycle/
    // 环形链表
    // 注意空间复杂度
    private boolean hasCycle(ListNode head) {
        // 双指针  快慢指针
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(0);
        node2.next = node3;
        ListNode node4 = new ListNode(-4);
        node3.next = node4;
        node4.next = node1;
        LeetCode_2_141 test = new LeetCode_2_141();
        System.out.println(test.hasCycle(node1));
    }
}
