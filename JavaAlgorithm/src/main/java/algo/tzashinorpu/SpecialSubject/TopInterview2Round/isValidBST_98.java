package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import algo.tzashinorpu.SpecialSubject.TreeNode;

public class isValidBST_98 {
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean dfs(TreeNode node, long upper, long lower) {
        if (node == null) return true;
        if (node.val >= upper || node.val <= lower) return false;
        return dfs(node.left, node.val, lower) && dfs(node.right, upper, node.val);
    }
}
