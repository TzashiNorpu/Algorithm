package algo.tzashinorpu.WeekContest.D220703;

import algo.tzashinorpu.SpecialSubject.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class spiralMatrix_6111Test {

    @Test
    void spiralMatrix() {
        spiralMatrix_6111 ins = new spiralMatrix_6111();
        ListNode list = new ListNode(3);
        list.next = new ListNode(0);
        list.next.next = new ListNode(2);
        list.next.next.next = new ListNode(6);
        list.next.next.next.next = new ListNode(8);
        list.next.next.next.next.next = new ListNode(1);
        System.out.println(Arrays.deepToString(ins.spiralMatrix(3, 5, list)));
    }
}