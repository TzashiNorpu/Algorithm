package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class maxPathSum_124 {
    int res = 0;

    public int maxPathSum(TreeNode root) {
        res = root.val;
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int l = Math.max(helper(root.left), 0);
        int r = Math.max(helper(root.right), 0);
        res = Math.max(res, l + r + root.val);
        return Math.max(l, r) + root.val;
    }
}
