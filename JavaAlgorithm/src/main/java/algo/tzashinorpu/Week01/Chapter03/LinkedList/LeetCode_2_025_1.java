package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_025_1 {
    // Input:1->2->3->4->5,k=2  Output:2->1->4->3->5
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        // 存储当前队列的临时变量
        ListNode currKPrev = dummyNode;
        ListNode currKTail = dummyNode;

        while (currKTail!=null) {
            for (int i = 0; i < k && currKTail != null; i++) currKTail = currKTail.next;
            // 最后几个元素不足k个元素
            if (currKTail == null) break;
            // 拿到下一组的队首元素
            ListNode nxtKHead = currKTail.next;
            // 拿到当前的队首元素
            ListNode currKHead = currKPrev.next;
            // 截断当前队列
            currKTail.next =null;
            // 反转当前队列  并将反转后的队首 接到前队列的队尾
            currKPrev.next = reverse(currKHead);
            // 当前队列反转后 队首元素变更为队尾元素 将该元素拼接至后队列的队首元素
            currKHead.next = nxtKHead;
            // 当前队列的队首元素在队列反转后成为后队列的 prev 元素
            currKPrev = currKHead;
            // currKTail 和 currKPrev 指向同一个元素
            currKTail = currKHead;
        }
        return dummyNode.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(5);
        ListNode node3 = new ListNode(4, tail);
        ListNode node2 = new ListNode(3, node3);

        /*ListNode tail = new ListNode(4);
        ListNode node2 = new ListNode(3, tail);*/

        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(1, node1);
        LeetCode_2_025_1 solution = new LeetCode_2_025_1();
        ListNode listNode = solution.reverseKGroup(head,3);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
