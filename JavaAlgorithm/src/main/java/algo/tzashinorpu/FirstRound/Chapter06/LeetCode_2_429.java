package algo.tzashinorpu.FirstRound.Chapter06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_2_429 {
    // TODO
    // https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        int level = 0;
        traverse1(root, level, res);
        return res;
    }

    // 递归
    private void traverse1(Node root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        // 当前层第一次进入时创建用于存储当前层节点值的空间
        if (level == res.size()) {
            res.add(new ArrayList<>());
        }
        // 将当前层的值加入到当前层对应的空间内
        res.get(level).add(root.val);
        if (root.childrens != null) {
            for (Node node : root.childrens) {
                if (node != null) {
                    traverse1(node, level + 1, res);
                }
            }
        }
    }

    // 堆栈
    private List<List<Integer>> traverse2(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if (root == null) {
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            ArrayList<Integer> currLevelValues = new ArrayList<>();
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node node = stack.poll();
                // 每次都将当前层的节点弹出的同时将该节点的左右子节点全部按顺序(当前节点的所有子节点按从左到右压入到栈的底部)压入栈中
                currLevelValues.add(node.val);
                if (node.childrens != null) {
                    stack.addAll(node.childrens);
                }
            }
            res.add(currLevelValues);
        }
        return res;
    }

    public static void main(String[] args) {
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        List<Node> temp1 = new ArrayList<>();
        temp1.add(node5);
        temp1.add(node6);
        Node node3 = new Node(3, temp1);
        Node node2 = new Node(2, null);
        Node node4 = new Node(4, null);
        List<Node> temp2 = new ArrayList<>();
        temp2.add(node3);
        temp2.add(node2);
        temp2.add(node4);
        Node node1 = new Node(1, temp2);
        List<List<Integer>> res = new ArrayList<>();

        LeetCode_2_429 test = new LeetCode_2_429();
//        res = algo.tzashinorpu.test.traverse2(node1);
        res = test.levelOrder(node1);

        System.out.println(res);
    }
}
