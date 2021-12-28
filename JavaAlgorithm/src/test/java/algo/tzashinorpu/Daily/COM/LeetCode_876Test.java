package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_876Test {

    @Test
    void middleNode() {
        LeetCode_876 ins = new LeetCode_876();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(ins.middleNode1(head).val);
        System.out.println(ins.middleNode2(head).val);
        System.out.println(ins.middleNode3(head).val);
    }
}