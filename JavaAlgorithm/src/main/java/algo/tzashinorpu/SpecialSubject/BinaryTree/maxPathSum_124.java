package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class maxPathSum_124 {
    int res;

    public int maxPathSum(TreeNode root) {
        res = root.val;
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        /*if (root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        res = Math.max(Math.max(l, r), l + r + root.val);
        return res;*/

        if (root == null) return 0;
        int l = Math.max(helper(root.left), 0);
        int r = Math.max(helper(root.right), 0);
        res = Math.max(res, l + r + root.val);
        return Math.max(l, r) + root.val;
    }
}
