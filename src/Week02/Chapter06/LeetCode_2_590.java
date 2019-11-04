package Week02.Chapter06;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_590 {
    // https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/

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
        postOrder(node1, res);
        System.out.println(res);
    }

    private static void postOrder(Node node, List<Integer> res) {
        if (node != null) {
            // 递归最外层 node.childrens == null -> 说明到达叶子节点
            // 有叶子节点的节点 ,循环完叶子节点后退出
            if(node.childrens!=null) {
                for (int i = 0; i < node.childrens.size(); i++) {
                    if (node.childrens.get(i) != null) {
                        postOrder(node.childrens.get(i), res);
                    }
                }
            }
            res.add(node.val);
        }
    }
}
