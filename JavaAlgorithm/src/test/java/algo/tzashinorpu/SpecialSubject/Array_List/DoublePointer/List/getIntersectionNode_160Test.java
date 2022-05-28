package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.List;

import algo.tzashinorpu.SpecialSubject.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class getIntersectionNode_160Test {

    @Test
    void getIntersectionNode() {
        getIntersectionNode_160 ins = new getIntersectionNode_160();
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(5);
        ListNode headA = new ListNode(2);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(4);
        System.out.println(ins.getIntersectionNode(headA, headB));
    }
}