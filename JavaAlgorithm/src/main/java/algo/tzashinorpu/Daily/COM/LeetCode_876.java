package algo.tzashinorpu.Daily.COM;

public class LeetCode_876 {
    public ListNode middleNode1(ListNode head) {
        int size = 0;
        ListNode cursor = head;
        while (head != null) {
            head = head.next;
            size++;
        }
        int index = size / 2;
        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }
        return cursor;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode3(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int index = 0;
        while (head != null) {
            arr[index++] = head;
            head = head.next;
        }
        return arr[index / 2];
    }
}
