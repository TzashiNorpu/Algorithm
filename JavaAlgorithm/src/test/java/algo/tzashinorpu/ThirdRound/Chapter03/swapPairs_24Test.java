package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class swapPairs_24Test {

    @Test
    void swapPairs() {
        swapPairs_24 ins = new swapPairs_24();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ins.swapPairs(head);
    }
}