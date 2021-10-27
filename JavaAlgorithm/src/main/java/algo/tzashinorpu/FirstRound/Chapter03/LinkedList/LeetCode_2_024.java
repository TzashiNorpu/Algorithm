package algo.tzashinorpu.FirstRound.Chapter03.LinkedList;

public class LeetCode_2_024 {
    // https://leetcode.com/problems/swap-nodes-in-pairs/
    // 两两交换链表中的节点
    // 图解 -- https://leetcode.wang/leetCode-24-Swap-Nodes-in-Pairs.html
    private ListNode swapPairs(ListNode node) {
        // dummy用于记住head的位置 --> dummy.next
        // point用于遍历链表
        ListNode dummy = new ListNode(0);
        dummy.next = node;
        ListNode point = dummy;
        while (point.next != null && point.next.next != null) {
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;
            point.next = swap2;
            swap1.next = swap2.next;
            swap2.next = swap1;
            point = swap1;
        }
        return dummy.next;
    }

    private ListNode swapPairs1(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        /*
         * head
         * next = head.next
         *
         * next.next = head
         * --> 上述代码完成 head  和 next 元素的互换,并修改了指针的指向  指针指向的修改需要在递归返回后逐层从后往前修改
         * head.next = swapPairs1()
         *    --> 修改当前层第二个交换元素的指向  并在递归的下一层实现下两个元素的互换         *
         **/
        ListNode next = head.next;
        head.next = swapPairs1(next.next);
        next.next = head;
        return next;
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
        LeetCode_2_024 test = new LeetCode_2_024();
        ListNode node = test.swapPairs(node1);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("-------------SWAP-------------");
        ListNode nodex = test.swapPairs1(node2);
        while (nodex!=null){
            System.out.println(nodex.val);
            nodex = nodex.next;
        }
    }
}
