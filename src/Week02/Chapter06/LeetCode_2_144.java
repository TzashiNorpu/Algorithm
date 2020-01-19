package Week02.Chapter06;


import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_144 {
    // https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
    //      1
    //          2
    //        3
    private void preOrder(BinaryTree node, List<Integer> res) {
        if (node != null) {
            res.add(node.val);
            System.out.println(res);
            if (node.left != null) {
                System.out.printf("Left:%s%n", node.left);
                preOrder(node.left, res);
            }
            if (node.right != null) {
                System.out.printf("Right:%s%n", node.right);
                preOrder(node.right, res);
            }
        }
        if (node != null)
            System.out.printf("Node value:%d%n", node.val);
    }

    public static void main(String[] args) {
        BinaryTree node1 = new BinaryTree(1);
        BinaryTree node2 = new BinaryTree(2);
        BinaryTree node3 = new BinaryTree(3);
        node1.right = node2;
        node2.left = node3;
        List<Integer> res = new ArrayList<>();

        LeetCode_2_144 Test = new LeetCode_2_144();
        Test.preOrder(node1, res);
        System.out.println(res);
    }
}
