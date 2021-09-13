package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import algo.tzashinorpu.Week02.Chapter06.LeetCode_2_094_1;

import java.util.List;

public class LeetCode_2_226 {
    public BinaryTree invertTree(BinaryTree root) {
        if (root == null) {
            return null;
        }
        BinaryTree temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(4);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(7);
        root.left.left = new BinaryTree(1);
        root.left.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(9);
        LeetCode_2_226 instance = new LeetCode_2_226();
        System.out.println("Before invert...");
        LeetCode_2_094_1 traverse1 = new LeetCode_2_094_1();
        List<Integer> integers1 = traverse1.inorderTraversal(root);
        for (Integer ele :
                integers1) {
            System.out.println(ele);
        }

        System.out.println("After invert...");
        BinaryTree res = instance.invertTree(root);
        LeetCode_2_094_1 traverse2 = new LeetCode_2_094_1();
        List<Integer> integers2 = traverse2.inorderTraversal(res);
        for (Integer ele :
                integers2) {
            System.out.println(ele);
        }

    }
}
