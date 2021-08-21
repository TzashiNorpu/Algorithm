package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_142 {
    // 图示：https://leetcode.com/problems/linked-list-cycle-ii/discuss/44774/Java-O(1)-space-solution-with-detailed-explanation.
    private ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast=head;
        while (fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                ListNode slow2 = head;
                while (slow != slow2) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
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
        LeetCode_2_142 test = new LeetCode_2_142();
        System.out.println(test.detectCycle(node1).val);
    }
}
