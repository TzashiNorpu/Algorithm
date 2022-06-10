package algo.tzashinorpu.SpecialSubject.BinaryTree;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class longestZigZag_1372 {
    int res = 0;

    public int longestZigZag(TreeNode root) {
        helper(root, false, false, 0);
        return res;
    }

    private void helper(TreeNode root, boolean left, boolean right, int path) {
        if (root == null) return;
        res = Math.max(res, path);
        helper(root.left, true, false, right ? path + 1 : 1);
        helper(root.right, false, true, left ? path + 1 : 1);
    }
}
