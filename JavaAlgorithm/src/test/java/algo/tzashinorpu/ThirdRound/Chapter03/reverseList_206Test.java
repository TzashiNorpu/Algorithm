package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reverseList_206Test {

    @Test
    void reverseList() {
        reverseList_206 ins = new reverseList_206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ins.reverseList(head);
    }
}