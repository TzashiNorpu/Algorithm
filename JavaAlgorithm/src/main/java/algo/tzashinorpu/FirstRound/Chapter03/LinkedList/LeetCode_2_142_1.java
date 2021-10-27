package algo.tzashinorpu.FirstRound.Chapter03.LinkedList;

public class LeetCode_2_142_1 {
     /*public ListNode detectCycle(ListNode head) {
        LinkedList<ListNode> visited = new LinkedList<>();
        while (head != null) {
            if (!visited.contains(head)) {
                visited.add(head);
                head = head.next;
            } else {
                return head;
            }
        }
        return null;
    }*/


    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        // a+n(b+c)+b=a+(n+1)b+nca+n(b+c)+b=a+(n+1)b+nc
        // a+(n+1)b+nc=2(a+b)=>a=c+(n−1)(b+c)=>head走a步，slow走c+(n−1)(b+c)步，到达入环点
        ListNode slow = head;
        ListNode fast = head;
        ListNode ptr = head;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // ptr 和 slow 重合时 ptr刚好走了 a 步
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
