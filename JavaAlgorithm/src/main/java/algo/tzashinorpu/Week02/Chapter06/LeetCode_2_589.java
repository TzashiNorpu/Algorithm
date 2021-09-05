package algo.tzashinorpu.Week02.Chapter06;

import java.util.*;

public class LeetCode_2_589 {
    // TODO
    // https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        traverse1(root, res);
        return res;
    }

    private void traverse1(Node root, ArrayList<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.childrens != null) {
                for (int i = 0; i < root.childrens.size(); i++) {
                    traverse1(root.childrens.get(i), res);
                }
            }
        }
    }


    private List<Integer> traverse2(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node tmp = stack.pollLast();
            res.add(tmp.val);
            // 改变当前层元素顺序,下一次可以弹出最左边的元素
            // 或者在for循环时使用降序
            Collections.reverse(tmp.childrens);
            // 可以使用增强型for循环
            if (tmp.childrens != null) {
                for (int i = 0; i < tmp.childrens.size(); i++) {
                    if (tmp.childrens.get(i) != null) {
                        stack.add(tmp.childrens.get(i));
                    }
                }
            }
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
        List<Integer> res = new ArrayList<>();
        final LeetCode_2_589 test = new LeetCode_2_589();
//        res = algo.tzashinorpu.test.preorder(node1);
        res = test.preorder(node1);
        System.out.println(res);
    }
}
