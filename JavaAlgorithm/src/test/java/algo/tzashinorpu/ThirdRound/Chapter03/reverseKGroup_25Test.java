package algo.tzashinorpu.ThirdRound.Chapter03;

import algo.tzashinorpu.ThirdRound.ListNode;
import org.junit.jupiter.api.Test;

class reverseKGroup_25Test {

    @Test
    void reverseKGroup() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        reverseKGroup_25 ins = new reverseKGroup_25();
        ListNode res = ins.reverseKGroup(listNode, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}