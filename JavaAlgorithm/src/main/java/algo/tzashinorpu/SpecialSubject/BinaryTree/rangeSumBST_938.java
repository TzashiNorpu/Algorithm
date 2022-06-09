package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class rangeSumBST_938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int l = rangeSumBST(root.left, low, high);
        int r = rangeSumBST(root.right, low, high);
        if (root.val <= high && root.val >= low) return l + r + root.val;
        else return l + r;
    }
}
