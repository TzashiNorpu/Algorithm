package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;
import org.junit.jupiter.api.Test;

class isPalindrome_234Test {

    @Test
    void isPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        isPalindrome_234 ins = new isPalindrome_234();
        System.out.println(ins.isPalindrome(head));
    }
}