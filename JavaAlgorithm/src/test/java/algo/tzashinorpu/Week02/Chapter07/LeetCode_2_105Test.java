package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;
import algo.tzashinorpu.Week02.Chapter06.LeetCode_2_094_1;
import org.junit.jupiter.api.Test;

class LeetCode_2_105Test {


    @Test
    void buildTree1() {
    }

    @Test
    void buildTree3() {
        /*BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.left.right.left = new BinaryTree(8);
        root.left.right.right = new BinaryTree(9);

        root.right = new BinaryTree(3);
        root.right.left = new BinaryTree(6);
        root.right.left.right = new BinaryTree(10);
        root.right.right = new BinaryTree(7);*/
        LeetCode_2_105 instance = new LeetCode_2_105();
        int[] preorder = {1, 2, 4, 5, 8, 9, 3, 6, 10, 7};
        int[] inorder = {4, 2, 8, 5, 9, 1, 6, 10, 3, 7};
//        BinaryTree root = instance.buildTree2(preorder, inorder);
        BinaryTree root = instance.buildTree3(preorder, inorder);

        LeetCode_2_094_1 traverse = new LeetCode_2_094_1();
        System.out.println(traverse.inorderTraversal(root));
    }
}