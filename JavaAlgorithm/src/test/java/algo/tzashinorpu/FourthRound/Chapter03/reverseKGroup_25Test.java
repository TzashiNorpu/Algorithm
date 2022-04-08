package algo.tzashinorpu.FourthRound.Chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reverseKGroup_25Test {

    @Test
    void reverseKGroup() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseKGroup_25 ins = new reverseKGroup_25();
        ListNode res = ins.reverseKGroup(head, 4);
        while (res != null) {
            System.out.printf(res.val + "->");
            res = res.next;
        }
        System.out.println("null");
    }
}