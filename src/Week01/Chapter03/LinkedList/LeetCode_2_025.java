package Week01.Chapter03.LinkedList;

public class LeetCode_2_025 {
    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    //  每 k 个节点一组进行翻转
    // Input:1->2->3->4->5,k=2  Output:2->1->4->3->5
    private ListNode reverseKGroup(ListNode node, int k) {
        ListNode left = node, right = node;
        int count = 0;
        // use right to locate the range
        // 结束后 right 指向 [k] 元素
        while (right != null) {
            while (right != null && count < k) {
                right = right.next;
                count += 1;
            }
            // if size k satisfied, reverse the inner linked list
            if (count == k) {
                int i = 0;
                // # standard reversing
                // 0 -- k 顺时针翻转
                while (i < k) {
                    ListNode tmp = left.next;
                    left.next = right;
                    right = left;
                    left = tmp;
                    i++;
                }
            }

            count = 0;
        }
        return right;
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
