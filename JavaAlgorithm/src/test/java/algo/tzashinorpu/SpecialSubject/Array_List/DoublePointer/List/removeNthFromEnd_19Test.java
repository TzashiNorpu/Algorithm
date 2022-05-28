package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class removeNthFromEnd_19Test {

    @Test
    void removeNthFromEnd() {
        removeNthFromEnd_19 ins = new removeNthFromEnd_19();
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
        int n = 1;
        System.out.println(ins.removeNthFromEnd(head, n).val);
    }
}