package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class flipEquiv_951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null) return false;
        if (root2 == null) return false;

        boolean l1 = flipEquiv(root1.left, root2.left);
        boolean r1 = flipEquiv(root1.right, root2.right);

        boolean l2 = flipEquiv(root1.right, root2.left);
        boolean r2 = flipEquiv(root1.left, root2.right);
        boolean b = root1.val == root2.val;
        return ((l1 && r1) || (l2 && r2)) && b;
    }

}
