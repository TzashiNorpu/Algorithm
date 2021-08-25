package algo.tzashinorpu.Week01.Chapter03.LinkedList;

public class LeetCode_2_025 {
    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    // 图解:https://leetcode-cn.com/problems/reverse-nodes-in-k-group/solution/tu-jie-kge-yi-zu-fan-zhuan-lian-biao-by-user7208t/
    // 每 k 个节点一组进行翻转
    // Input:1->2->3->4->5,k=2  Output:2->1->4->3->5
    private ListNode reverseKGroup(ListNode node, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = node;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) end = end.next;
            // 处理末尾不是K个的group
            if (end == null) break;
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            // reverse(start)返回的是翻转后的head元素
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    // 1-->2--3-->null
    // loop1:
    // [执行完 ListNode next = curr.next和curr.next = pre后: next:2-->3-->null,curr:1-->null,此时curr元素本身不变]
    // [执行完pre=curr和curr=next后: pre:null<--1  curr:2-->3-->null]
    // loop2:
    // [执行完 ListNode next = curr.next和curr.next = pre后: next:3-->null,curr:2-->1-->null]
    // [执行完pre=curr和curr=next后: pre:null<--1<--2  curr:3-->null]
    // loop3:
    // [执行完 ListNode next = curr.next和curr.next = pre后: next:null,curr:3-->2-->1-->null]
    // [执行完pre=curr和curr=next后: pre:null<--1<--2<--3  curr:null]
    private ListNode reverse(ListNode node) {
        ListNode pre = null;
        ListNode curr = node;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(3);
        node2.next = node3;
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        ListNode node5 = new ListNode(5);
        node4.next = node5;

        LeetCode_2_025 test = new LeetCode_2_025();

        ListNode node = test.reverseKGroup(node1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
