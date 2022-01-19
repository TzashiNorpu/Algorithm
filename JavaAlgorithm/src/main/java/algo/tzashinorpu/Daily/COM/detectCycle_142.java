package algo.tzashinorpu.Daily.COM;

public class detectCycle_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode ptr = head;
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // slow 和 fast 相遇后  slow 到入环的距离 = head 到入环的距离
            // https://leetcode.com/problems/linked-list-cycle-ii/discuss/44774/Java-O(1)-space-solution-with-detailed-explanation.
            if (slow == fast) {
               /* if (ptr == slow) {
                    return ptr;
                } else {
                    ptr = ptr.next;
                    slow = slow.next;
                }*/
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
