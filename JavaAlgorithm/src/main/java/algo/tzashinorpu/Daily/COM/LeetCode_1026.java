package algo.tzashinorpu.Daily.COM;

public class LeetCode_1026 {
    private int gap = 0;

    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val, root.val);
        return gap;
    }

    private void dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return;
        }
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        this.gap = Math.max(Math.abs(max - min), gap);
        dfs(root.left, min, max);
        dfs(root.right, min, max);
    }
}
