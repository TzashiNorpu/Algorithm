package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class sumEvenGrandparent_1315 {

    public int sumEvenGrandparent(TreeNode root) {
        return helper(root, false, false);
    }

    private int helper(TreeNode root, boolean parent, boolean grand) {
        if (root == null) return 0;
        int l = helper(root.left, root.val % 2 == 0, parent);
        int r = helper(root.right, root.val % 2 == 0, parent);
        if (grand) return l + r + root.val;
        else return l + r;
    }
}
