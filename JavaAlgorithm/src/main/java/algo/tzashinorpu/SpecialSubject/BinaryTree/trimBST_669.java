package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class trimBST_669 {
    /*
             3
          1    4
     null   2
     [3,4]
     */
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) return null;
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        if (root.val < low) return root.right;
        if (root.val > high) return root.left;
        return root;
    }
}
