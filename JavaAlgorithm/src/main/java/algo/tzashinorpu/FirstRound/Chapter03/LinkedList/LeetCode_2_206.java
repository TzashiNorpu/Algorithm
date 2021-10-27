package algo.tzashinorpu.FirstRound.Chapter03.LinkedList;

public class LeetCode_2_206 {
    // https://leetcode.com/problems/reverse-linked-list/
    // 链表翻转
    private ListNode reverseList1(ListNode node) {
        // Iterative
        ListNode prevNode = null;
        while (node != null) {
            // 调转指针指向的方向
            // 修改当前节点指针的指向   保存当前节点用于下一个节点指针指向的更新  更新当前节点为当前节点的下一个节点
            ListNode next = node.next;
            node.next = prevNode;
            prevNode = node;
            node = next;
        }
        return prevNode;
    }

    private ListNode reverseList2(ListNode currNode, ListNode prevNode) {
        if (currNode == null) {
            return prevNode;
        }
        // 拿到当前节点的下一个节点 调转当前节点的指针指向
        // 用下一个节点和当前节点递归调用
        ListNode next = currNode.next;
        currNode.next = prevNode;
        return reverseList2(next, currNode);
    }

    private ListNode reverseList(ListNode currNode) {
        // recursive
        return reverseList2(currNode, null);
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
        LeetCode_2_206 test = new LeetCode_2_206();
        ListNode node;
        node = node1;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("------------REVERSE1-----------");
        node = test.reverseList1(node1);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("------------REVERSE2-----------");
        node = test.reverseList(node5);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }
}
