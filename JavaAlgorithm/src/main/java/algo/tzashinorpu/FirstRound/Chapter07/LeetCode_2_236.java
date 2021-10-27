package algo.tzashinorpu.FirstRound.Chapter07;


import algo.tzashinorpu.FirstRound.Chapter06.BinaryTree;

public class LeetCode_2_236 {
    public BinaryTree lowestCommonAncestor(BinaryTree root, BinaryTree p, BinaryTree q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        BinaryTree left = lowestCommonAncestor(root.left, p, q);
        BinaryTree right = lowestCommonAncestor(root.right, p, q);
        if (right != null && left != null) {
            return root;
        }
        if (left == null) {
            return right;
        } else {
            return left;
        }
    }
}
