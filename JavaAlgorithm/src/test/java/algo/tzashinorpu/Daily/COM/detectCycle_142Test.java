package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class detectCycle_142Test {

    @Test
    void detectCycle() {
        ListNode head = new ListNode(3);
        ListNode cir = new ListNode(2);
        head.next = cir;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = cir;

        detectCycle_142 ins = new detectCycle_142();
        System.out.println(ins.detectCycle(head).val);
    }
}