package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class isSubtree_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val == subRoot.val) return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
        return false;
    }
}
