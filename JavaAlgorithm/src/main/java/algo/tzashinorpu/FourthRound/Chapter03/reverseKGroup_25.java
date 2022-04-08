package algo.tzashinorpu.FourthRound.Chapter03;

public class reverseKGroup_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode start = head;
        ListNode nextStart;
        ListNode end = head;
        while (end != null) {
            int tmpK = k;
            while (end != null && (--tmpK) > 0) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            nextStart = end.next;
            end.next = null;
            prev.next = reverse(start);
            start.next = nextStart;
            prev = start;
            start = nextStart;
            end = start;
            prev.next = start;
        }
        return dummyHead.next;
    }

    /*private ListNode reverse(ListNode start) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = start;
        ListNode prev = dummyHead;
        ListNode curr = start;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }*/
    private ListNode reverse(ListNode start) {
        if (start == null || start.next == null) {
            return start;
        }
        ListNode newHead = reverse(start.next);
        start.next.next = start;
        start.next = null;
        return newHead;
    }
}
