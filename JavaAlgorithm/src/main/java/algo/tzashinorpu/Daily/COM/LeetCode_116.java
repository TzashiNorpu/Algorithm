package algo.tzashinorpu.Daily.COM;

import java.util.LinkedList;

public class LeetCode_116 {
    public Node connect1(Node root) {
        if (root == null) return root;
        Node dummyHead = root;
        LinkedList<Node> stack = new LinkedList<>();
        stack.offer(root);
        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node pop = stack.poll();
                if (i != size - 1) {
                    pop.next = stack.peek();
                }
                if (pop.left != null) {
                    stack.offer(pop.left);
                }
                if (pop.right != null) {
                    stack.offer(pop.right);
                }
            }
        }
        return dummyHead;
    }

    public Node connect2(Node root) {
        Node node = root;
        // 下探一层
        while (node.left != null) {
            Node left = node.left;
            // 遍历当前层
            while (node != null) {
                node.left.next = node.right;
                if (node.right != null && node.next != null) {
                    node.right.next = node.next.left;
                }
                node = node.next;
            }
            node = left;
        }
        return root;
    }
}
