package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class isPalindrome_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMiddleNode(head);
        ListNode newHead = reverse(mid);
        return compare(head, newHead);
    }

    private boolean compare(ListNode head, ListNode mid) {
        while (mid != null) {
            if (head == null) return false;
            if (mid.val != head.val) return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }

    // 1->2->3
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private ListNode getMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
