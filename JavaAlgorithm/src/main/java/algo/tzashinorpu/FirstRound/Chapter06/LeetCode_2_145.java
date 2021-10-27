package algo.tzashinorpu.FirstRound.Chapter06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_2_145 {
    private List<Integer> postOrderTraversal(BinaryTree root) {
        List<Integer> res = new ArrayList<>();
//        traverse1(root, res);
        res = traverse2(root);
        return res;
    }

    // 递归
    private void traverse1(BinaryTree root, List<Integer> res) {
        if (root == null) {
            return;
        }
        traverse1(root.left, res);
        traverse1(root.right, res);
        res.add(root.val);
    }

    // 栈
    // 左右根 -- 根左右遍历后逆序存储(addFirst)
    private LinkedList<Integer> traverse2(BinaryTree root) {
        LinkedList<BinaryTree> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();

        if (root == null) {
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            BinaryTree node = stack.pollLast();
            res.addFirst(node.val);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode_2_145 test = new LeetCode_2_145();
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        BinaryTree node4 = new BinaryTree(4);
        BinaryTree node5 = new BinaryTree(5);
        node1.left = node2;
        node2.right = node3;
        node3.left = node4;
        node3.right = node5;
        List<Integer> res = test.postOrderTraversal(node1);
        System.out.println(res);
    }
}
