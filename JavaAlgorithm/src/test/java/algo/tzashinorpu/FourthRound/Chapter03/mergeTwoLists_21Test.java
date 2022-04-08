package algo.tzashinorpu.FourthRound.Chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mergeTwoLists_21Test {

    @Test
    void mergeTwoLists() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(5);
      /*  list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);*/
        mergeTwoLists_21 ins = new mergeTwoLists_21();
        ListNode listNode = ins.mergeTwoLists(list1, list2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}