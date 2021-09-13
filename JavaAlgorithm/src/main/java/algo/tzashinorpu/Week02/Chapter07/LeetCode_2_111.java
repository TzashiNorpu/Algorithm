package algo.tzashinorpu.Week02.Chapter07;

import algo.tzashinorpu.Week02.Chapter06.BinaryTree;

public class LeetCode_2_111 {

    public int minDepth1(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, 1);
    }

    private int dfs(BinaryTree root, int minDepth) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return minDepth;
        }
        minDepth = minDepth + 1;
        return Math.min(dfs(root.left, minDepth), dfs(root.right, minDepth));
    }

    public int minDepth2(BinaryTree root) {
       
    }


    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(2);
        /*root.left = new BinaryTree(9);
        root.right = new BinaryTree(20);
        root.right.left = new BinaryTree(15);
        root.right.right = new BinaryTree(7);*/
        root.right = new BinaryTree(3);
        root.right.right = new BinaryTree(4);
        root.right.right.right = new BinaryTree(5);
        root.right.right.right.right = new BinaryTree(6);
        LeetCode_2_111 instance = new LeetCode_2_111();
        System.out.println(instance.minDepth1(root));
    }
}
